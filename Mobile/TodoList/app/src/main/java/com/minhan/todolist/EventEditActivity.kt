package com.minhan.todolist

import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalTime
import java.util.*


class EventEditActivity : AppCompatActivity() {
    private var eventNameET: EditText? = null
    private var eventContentET: EditText? = null
    private var eventDateTV: TextView? = null
    private var eventTimeTV: TextView? = null
    private var timeButton: Button? = null
    private var saveEventAction: Button? = null
    private var hour = 0
    private var minute = 0

    @RequiresApi(Build.VERSION_CODES.O)
    private var time: LocalTime = LocalTime.now()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_edit)
        initWidgets()

        val intent = intent
        var event = intent.getParcelableExtra<Event>("Event")
        println("\n${event?.name}\n")
        if(event != null){
            eventNameET?.setText(event.name)
            eventContentET?.setText(event.content)
            eventDateTV?.text = "Date: " + event.date.toString()
            eventTimeTV?.text = "Time: " + event.time.toString()
            saveEventAction!!.text = "Update"
        }else{
            eventDateTV!!.text = "Date: " + CalendarUtils.formattedDate(CalendarUtils.selectedDate!!)
            eventTimeTV!!.text = "Time: " + CalendarUtils.formattedTime(time)
        }

        saveEventAction?.setOnClickListener {
            val eventName = eventNameET!!.text.toString()
            val eventContent = eventContentET!!.text.toString()
            val done = false

            if(event == null){
                val newEvent = Event(eventName,eventContent,done, CalendarUtils.selectedDate!!, time)
                Event.eventsList.add(newEvent)
                finish()
            }else{
                var pos = intent.getIntExtra("Position",-1)
                println("\npos: ${pos}\n")
                Event.eventsList[pos] = Event(eventName,eventContent,done, event.date, event.time)
                finish()
            }
        }
    }

    private fun initWidgets() {
        eventNameET = findViewById(R.id.eventNameET)
        eventContentET = findViewById(R.id.eventContentET)
        eventDateTV = findViewById(R.id.eventDateTV)
        eventTimeTV = findViewById(R.id.eventTimeTV)
        timeButton = findViewById(R.id.timeButton)
        saveEventAction = findViewById(R.id.saveEventAction)
    }

//    @RequiresApi(Build.VERSION_CODES.O)
//    fun saveEventAction(view: View?) {
//        val eventName = eventNameET!!.text.toString()
//        val eventContent = eventContentET!!.text.toString()
//        val done = false
//        val newEvent = Event(eventName,eventContent,done, CalendarUtils.selectedDate!!, time)
//        Event.eventsList.add(newEvent)
//        finish()
//    }

    fun popTimePicker(view: View?) {
        val onTimeSetListener =
            OnTimeSetListener { _, selectedHour, selectedMinute ->
                hour = selectedHour
                minute = selectedMinute
                timeButton?.text = String.format(Locale.getDefault(), "%02d:%02d", hour, minute)
            }

        // int style = AlertDialog.THEME_HOLO_DARK;
        val timePickerDialog =
            TimePickerDialog(this,  /*style,*/onTimeSetListener, hour, minute, true)
        timePickerDialog.setTitle("Select Time")
        timePickerDialog.show()
    }
}
