package com.minhan.todolist

import android.graphics.Color
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate


class CalendarAdapter(
    private val days: ArrayList<LocalDate?>,
    private val onItemListener: OnItemListener
) :
    RecyclerView.Adapter<CalendarViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.calendar_cell, parent, false)
        val layoutParams = view.layoutParams
        if (days.size > 15) //month view
            layoutParams.height = (parent.height * 0.166666666).toInt() else  // week view
            layoutParams.height = parent.height
        return CalendarViewHolder(view, onItemListener, days)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        val date = days[position]
        if (date == null) holder.dayOfMonth.text = ""
        else {
//            println("\nEvent.eventsForDate("+date+"): "+Event.eventsForDate(date).size+"\n")
            var dayOfMonth = date.dayOfMonth.toString()
            var compareToDate = date.compareTo(CalendarUtils.selectedDate)

            when {
//                compareToDate == 0 ->  holder.parentView.setBackgroundColor( Color.parseColor( "#FFE4B5" ) )
                compareToDate == 0 -> holder.dayOfMonth.setTextColor(Color.parseColor("#FF66FF"))
                compareToDate < 0 -> holder.dayOfMonth.setTextColor(Color.parseColor("#F15F66"))
                else -> holder.dayOfMonth.setTextColor(Color.parseColor("#51A9FF"))
            }

            if (Event.eventsForDate(date).size > 0) {
                var flag = false
                for (e in Event.eventsForDate(date)) {
                    if (!e.done)  flag = true;
                }

                dayOfMonth += if (flag) "\n ●" else "\n\t。"
            }
            holder.dayOfMonth.text = dayOfMonth
        }
    }

    override fun getItemCount(): Int {
        return days.size
    }

    interface OnItemListener {
        fun onItemClick(position: Int, date: LocalDate?)
    }
}
