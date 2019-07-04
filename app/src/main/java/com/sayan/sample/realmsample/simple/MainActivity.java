package com.sayan.sample.realmsample.simple;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.sayan.sample.realmsample.R;

import java.util.Random;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a Realm instance for this thread
        Realm realm = Realm.getDefaultInstance();

        // Use them like regular java objects
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(1);

        // Query Realm for all dogs younger than 2 years old
        final RealmResults<Dog> puppies = realm.where(Dog.class).lessThan("age", 2).findAll();
        puppies.size(); // => 0 because no dogs have been added to the Realm yet

        // Persist your data in a transaction
        realm.beginTransaction();
        final Dog managedDog = realm.copyToRealm(dog); // Persist unmanaged objects
        Person person = realm.createObject(Person.class, new Random().nextLong()); // Create managed objects directly
        person.getDogs().add(managedDog);
        realm.commitTransaction();

        // Listeners will be notified when data changes
        puppies.addChangeListener(new OrderedRealmCollectionChangeListener<RealmResults<Dog>>() {
            @Override
            public void onChange(RealmResults<Dog> results, OrderedCollectionChangeSet changeSet) {
                // Query results are updated in real time with fine grained notifications.
                changeSet.getInsertions(); // => [0] is added.
            }
        });

        // Asynchronously update objects on a background thread
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm bgRealm) {
                Dog dog = bgRealm.where(Dog.class).equalTo("age", 1).findFirst();
                dog.setAge(3);
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                // Original queries and Realm objects are automatically updated.
                puppies.size(); // => 0 because there are no more puppies younger than 2 years old
                managedDog.getAge();   // => 3 the dogs age is updated
            }
        });
    }
}
