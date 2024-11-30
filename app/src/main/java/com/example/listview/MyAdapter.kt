package com.example.listview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>) : ArrayAdapter<User>(context, R.layout.eachrowdesign, arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.eachrowdesign, null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.txt_1)
        val lastMsg = view.findViewById<TextView>(R.id.txt_2)
        val lastMsgTime = view.findViewById<TextView>(R.id.txt_3)

        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMsg
        lastMsgTime.text = arrayList[position].lastMsgT
        image.setImageResource(arrayList[position].imageId)

        return view
    }
}
