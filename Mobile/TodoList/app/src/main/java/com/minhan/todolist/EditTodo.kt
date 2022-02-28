package com.minhan.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class EditTodo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_todo)

        val btnEdit = findViewById<ImageButton>(R.id.btnEdit)
        btnEdit.setOnClickListener{
            println("\nAAAAAAAAAAAA\n")
        }
    }
}