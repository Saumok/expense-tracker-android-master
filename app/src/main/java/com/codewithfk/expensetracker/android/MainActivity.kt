package com.unique.expensetracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example: Add Firebase Authentication
        val auth = FirebaseAuth.getInstance()
        auth.signInAnonymously().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                // User signed in successfully
            } else {
                // If sign-in fails, display a message to the user.
            }
        }
    }
}
