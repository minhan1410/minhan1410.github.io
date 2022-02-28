package com.minhan.todolist

import java.time.LocalDate
import java.time.LocalTime


class Event(var name: String,var content: String,var done:Boolean, var date: LocalDate, var time: LocalTime) {

    companion object {
        var eventsList: ArrayList<Event> = ArrayList<Event>();

        fun eventsForDate(date: LocalDate?): ArrayList<Event> {
            val events: ArrayList<Event> =
                ArrayList<Event>()
            for (event in eventsList) {
                if (event.date == date) events.add(event)
            }
            return events
        }
    }
}