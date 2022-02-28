package com.minhan.todolist

import android.content.Context
import android.os.Build
import android.service.autofill.FillEventHistory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi


class EventAdapter(context: Context, events: List<Event?>?) :
    ArrayAdapter<Event?>(context, 0, events!!) {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val event = getItem(position)
        val eventsList = Event.eventsList

        if (convertView == null) convertView =
            LayoutInflater.from(context).inflate(R.layout.event_cell, parent, false)

        val eventCellTV = convertView!!.findViewById<TextView>(R.id.eventCellTV)
        val eventTitle: String =
            event!!.name.uppercase() + "\n" + event.content.lowercase() + "\n" + CalendarUtils.formattedTime(
                event.time
            )

        eventCellTV.text = eventTitle


        val btnDelete = convertView.findViewById<ImageButton>(R.id.btnDelete)
        btnDelete.setOnClickListener {
            remove(event)
            Event.eventsList.remove(event)
        }


        val checkBoxDone = convertView.findViewById<CheckBox>(R.id.checkBoxDone)
        checkBoxDone.setOnClickListener { view ->
            if ((view as CompoundButton).isChecked) {
                println("\nChecked\n")
                event.done = true
            }else{
                event.done = false
            }
        }
            checkBoxDone.isEnabled = !event.done
            checkBoxDone.isChecked = event.done
//            println("\nevent.name: " + event.name +"\nevent.done: " + event.done + "\ncheckBoxDone.isEnabled: " + checkBoxDone.isEnabled + "\ncheckBoxDone.isChecked: " + checkBoxDone.isChecked)

        return convertView
    }
}