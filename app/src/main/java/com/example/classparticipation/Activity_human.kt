package com.example.classparticipation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_human.*

class Activity_human : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_human)
        val h = HumanInterface()
        h.intro()
        h.description()

        val introduction = h.intro()
        val description = h.description()
        text_id.setText("$introduction . $description")

    }
}