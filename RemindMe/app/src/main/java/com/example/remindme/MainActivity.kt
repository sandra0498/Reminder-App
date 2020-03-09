package com.example.remindme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.sql.Date
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var editEvent: EditText
    lateinit var  enterDate: Date

    //creating the class constants
    companion object{
        const val EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT"
        const val EXTRA_DATE = "com.example.application.example.EXTRA_DATE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //connects the user's entry of an event
        editEvent = findViewById(R.id.editEvent)

        //connects the user's entry of a specific date
        var editDate = findViewById<EditText>(R.id.EnterDate)

        val enterButton = findViewById<Button>(R.id.enterButton)
        enterButton.setOnClickListener {
            saveData()

            val assignment = editEvent.text.toString()
            val dueDate = editDate.text.toString()

            val intent = Intent(this, ResultsActivity :: class.java )
            intent.putExtra(EXTRA_TEXT,assignment)
            intent.putExtra(EXTRA_DATE,dueDate)
            startActivity(intent)

        }



    }

    private fun saveData(){
        val assignment = editEvent.text.toString()

        if(assignment.isEmpty()){
            editEvent.error = "Please enter an assignment! "
            return
        }

        val reference = FirebaseDatabase.getInstance().getReference("Assignments")
        val assignID = reference.push().key

       // val assignments = Assignments(assignment, dueDate)
    }
}
