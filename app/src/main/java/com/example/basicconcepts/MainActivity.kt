package com.example.basicconcepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() { //main class AppCompatActivity class provides a base implementation of an activity that supports the ActionBar feature and other common Android features.
    override fun onCreate(savedInstanceState: Bundle?) { //on create means initialize user interface. SavedInstance means contains data that was saved from a previous state of the activity
        super.onCreate(savedInstanceState) //call to the superclass implementation of the onCreate() method, ensures that any important setup or initialization performed by the superclass is still executed,
        setContentView(R.layout.activity_main) //set the layout for the activity's user interface.

        val UsernameEditText = findViewById<EditText>(R.id.username) //declares user input as a value
        val PasswordEditText = findViewById<EditText>(R.id.password)
        val Success = findViewById<Button>(R.id.Login)

        val username = UsernameEditText.text.toString() //used to retrieve the text entered in an EditText
        val password = PasswordEditText.text.toString()

       Success.setOnClickListener { //what happens when you click button
           if (username.trim() == "LionelM" && password.trim() == "Goat10") {
               Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show() //displays message, toast is a class that creates short messages,maketext creates the text,
           } else {
               Toast.makeText(this, "Username or password incorrect", Toast.LENGTH_SHORT).show()
           }
       }



    }
}