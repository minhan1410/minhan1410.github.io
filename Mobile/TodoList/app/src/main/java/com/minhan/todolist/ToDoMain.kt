package com.minhan.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Switch
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class ToDoMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchWeek = findViewById<Switch>(R.id.switch1)
        var constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        var month = CalendarView(this)
        constraintLayout.addView(month)

        switchWeek.setOnCheckedChangeListener { _, isChecked ->
            constraintLayout.removeAllViews()
            if (isChecked) {
                var week = TextView(this)
                week.setText("AHIHI WEEK")
                constraintLayout.addView(week)
                switchWeek.setText("Week")
            } else {
                constraintLayout.addView(month)
                switchWeek.setText("Month")
            }
        }

    }

}

