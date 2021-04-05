package com.example.classparticipation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plant_age_btn.setOnClickListener(this)
        human_age_btn.setOnClickListener(this)
        animal_age_btn.setOnClickListener(this)
        sbj_animal_btn.setOnClickListener(this)
        sbj_human_btn.setOnClickListener(this)
        sbj_plant_btn.setOnClickListener(this)

    }
    val pla = Plant()
    val hum = Human()
    val anim = Animal()

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id){
                R.id.plant_age_btn -> Toast.makeText(this,"Plants' average age :"+ anim.SubjectAge(),Toast.LENGTH_SHORT).show()
                R.id.human_age_btn -> Toast.makeText(this,"Humans' average age :"+ hum.SubjectAge(),Toast.LENGTH_SHORT).show()
                R.id.animal_age_btn -> Toast.makeText(this,"Animals' average age ,especially dogs':"+ pla.SubjectAge(),Toast.LENGTH_SHORT).show()
                R.id.sbj_animal_btn -> openActivityAnimal()
                R.id.sbj_human_btn -> openActivityHuman()
                R.id.sbj_plant_btn -> openActivityPlant()

            }
        }
    }
    public fun openActivityPlant(){
        val intent = Intent(this,Activity_plant::class.java)
        startActivity(intent)
    }
    public fun openActivityHuman(){
        val intent = Intent(this,Activity_human::class.java)
        startActivity(intent)
    }
    public fun openActivityAnimal(){
        val intent = Intent(this,Activity_animal::class.java)
        startActivity(intent)
    }
}