package com.example.classparticipation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animal.*

class Activity_animal : AppCompatActivity(){
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        val a = AnimalInterface()
        a.intro()
        a.description()

        val introduction = a.intro()
        val description = a.description()
        text_id.setText("$introduction . $description")
    }
}