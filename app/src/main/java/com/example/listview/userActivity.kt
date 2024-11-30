package com.example.listview

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class userActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val imgID = intent.getIntExtra("imgID", R.drawable.gamer)


        val nameTv = findViewById<TextView>(R.id.nametxt)
        val phoneTv = findViewById<TextView>(R.id.phonetxt)
        val profileImg = findViewById<CircleImageView>(R.id.profile_image)

        nameTv.text = name
        phoneTv.text = phone
        profileImg.setImageResource(imgID)

    }
}