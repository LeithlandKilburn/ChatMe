package com.bigupyuhself.chatme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.*
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_login.*
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        loginBUTLogin.setOnClickListener {
            val email = emailETLogin.text.toString()
            val password = passwordETLogin.text.toString()
            Log.d("LoginActivity",  "Attempt login with email/pw: $email/***")

            // Firebase authentication to create a user with email and password.
            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener {
                if (!it.isSuccessful) return@addOnCompleteListener

                    // else if successful
                    Log.d("Login", "Login successful with uid: ${it.result?.user?.uid}")
                }

                .addOnFailureListener{
                    Log.d("Main", "Failed to create user: ${it.message}")
                }

        }

        bakcTVLogin.setOnClickListener {
            finish()
        }

    }
}