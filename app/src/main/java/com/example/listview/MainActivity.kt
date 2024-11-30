package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()
        taskList.add("Task 1")
        taskList.add("Task 2")
        taskList.add("Task 3")
        taskList.add("Good to go")
        taskList.add("Good to Know")
        taskList.add("Good to find")


        val adapterTaskList = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)
        listView.adapter = adapterTaskList

        listView.setOnItemClickListener { adapterView, view, i, l ->

            val text = "Clicked on item: " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }


    }
}