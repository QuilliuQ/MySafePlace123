package com.example.mysafeplace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class LogInActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        email = findViewById(R.id.editTextTextEmailAddress)
        password = findViewById(R.id.editTextTextPassword)
    }
    fun signin(view: View){
        if (email.text.toString() == "admin" && password.text.toString() == "12345")
        {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
        else
        {
            val  alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }
}