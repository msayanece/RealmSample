package com.sayan.sample.realmsample;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sayan.sample.realmsample.complex.ComplexActivity;
import com.sayan.sample.realmsample.simple.MainActivity;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    public void onClickSimpleButton(View view) {
        startActivity( new Intent(this, MainActivity.class));
    }

    public void onClickComplexButton(View view) {
        startActivity( new Intent(this, ComplexActivity.class));
    }
}
