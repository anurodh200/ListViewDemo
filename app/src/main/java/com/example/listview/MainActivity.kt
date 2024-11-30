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

    lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Saumya", "Anulika", "Pratik", "Abhay", "Abhishek", "Akhand", "Ankit", "Anurodh")
        val lastMsg = arrayOf("Hey wssup", "I'm doing well", "Good morning", "See you later", "Can we talk?", "How's it going?", "All good?", "What's new?")
        val lastMsgT = arrayOf("4:35AM", "2:40PM", "1:00PM", "5:15PM", "6:30PM", "8:10AM", "3:45PM", "11:20AM")
        val phoneNo = arrayOf("1234567890", "9876543210", "1122334455", "9988776655", "7766554433", "6655443322", "5544332211", "4433221100")
        val imageId = intArrayOf(
            R.drawable.gamer, R.drawable.girl, R.drawable.hacker,
            R.drawable.human, R.drawable.gamer, R.drawable.girl,
            R.drawable.hacker, R.drawable.human
        )


        userArrayList = ArrayList()

        for(eachIdx in name.indices){
            val user = User(name[eachIdx], lastMsg[eachIdx], lastMsgT[eachIdx], phoneNo[eachIdx], imageId[eachIdx])
            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val name = name[i]
            val image = imageId[i]
            val time = lastMsgT[i]
            Toast.makeText(this, "Clicked on $name having messaged at $time", Toast.LENGTH_SHORT).show()
        }


//        val listView = findViewById<ListView>(R.id.listView)
//
//        val taskList = arrayListOf<String>()
//        taskList.add("Task 1")
//        taskList.add("Task 2")
//        taskList.add("Task 3")
//        taskList.add("Good to go")
//        taskList.add("Good to Know")
//        taskList.add("Good to find")
//
//
//        val adapterTaskList = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)
//        listView.adapter = adapterTaskList
//
//        listView.setOnItemClickListener { adapterView, view, i, l ->
//
//            val text = "Clicked on item: " + (view as TextView).text.toString()
//            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
//        }


    }
}