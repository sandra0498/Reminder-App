package com.example.remindme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterButton = findViewById<Button>(R.id.enterButton)

        //connects the user's entry of an event
        val editEvent = findViewById<EditText>(R.id.editEvent)

        //connects the user's entry of a specific date
        val editDate = findViewById<EditText>(R.id.editDate)



    }
}
