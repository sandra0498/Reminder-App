package com.example.remindme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //creating the class constants
    companion object{
        const val EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT"
        const val EXTRA_DATE = "com.example.application.example.EXTRA_DATE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //connects the user's entry of an event
        val editEvent = findViewById<EditText>(R.id.editEvent)

        //connects the user's entry of a specific date
        val editDate = findViewById<EditText>(R.id.EnterDate)

        val enterButton = findViewById<Button>(R.id.enterButton)
        enterButton.setOnClickListener {

            val assignment = editEvent.text.toString()
            val dueDate = editDate.text.toString()

            val intent = Intent(this, ResultsActivity :: class.java )
            intent.putExtra(EXTRA_TEXT,assignment)
            intent.putExtra(EXTRA_DATE,dueDate)
            startActivity(intent)

        }



    }
}
