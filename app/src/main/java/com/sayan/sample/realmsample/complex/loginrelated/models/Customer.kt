package com.sayan.sample.realmsample.complex.loginrelated.models

data class Customer(
        val id: String,
        val clientName: String,
        val clientDesignation: String,
        val clientProfilePic: String,
        val clientMobile: String,
        val clientEmail: String,
        val clientAddress: String,
        val aboutClient: String,
        val status: String,
        val createdDate: String,
        val createdSessionId: String,
        val createdIp: String
)