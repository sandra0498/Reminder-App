package com.example.remindme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)


        val resultAssign = intent.getStringExtra(MainActivity.EXTRA_TEXT)
        val resultDate = intent.getStringExtra(MainActivity.EXTRA_DATE)

        var displayResult = findViewById<TextView>(R.id.textView1)
        var displayDate = findViewById<TextView>(R.id.textView2)

        displayResult.setText(resultAssign)
        displayDate.setText(resultDate)




    }
}
