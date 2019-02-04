package com.bigupyuhself.chatme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.*
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        loginBUTLogin.setOnClickListener {
            val email = emailETLogin.text.toString()
            val password = passwordETLogin.text.toString()
            Log.d("LoginActivity",  "Attempt login with email/pw: $email/***")

            // Firebase authentication to create a user with email and password.

        }

        bakcTVLogin.setOnClickListener {
            finish()
        }

    }
}