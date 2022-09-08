package com.example.assignment

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class quiz : AppCompatActivity() {
    lateinit var jhon: CheckBox
    lateinit var ned: CheckBox
    lateinit var targarian: CheckBox
    lateinit var button: Button
    lateinit var textView: TextView
    lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        jhon = findViewById(R.id.jhon)
        ned = findViewById(R.id.ned)
        targarian = findViewById(R.id.targa)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.set)
        textView2 = findViewById(R.id.set2)


        button.setOnClickListener {

            textView.setTextColor(Color.parseColor("#212121"))

            if (jhon.isChecked && ned.isChecked) {
                textView.text = " "
                textView2.text = "You can select only one option"
            }
            else if (jhon.isChecked && targarian.isChecked) {
                textView.text = " "
                textView2.text = "You can select only one option"
            }
            else if (ned.isChecked && targarian.isChecked) {
                textView.text = " "
                textView2.text = "You can select only one option"
            }
            else if (jhon.isChecked && ned.isChecked && targarian.isChecked) {
                textView.text = " "
                textView2.text = "You can select only one option"
            }
            else if (jhon.isChecked) {
                textView.text = "Wrong Answer"
                textView.setTextColor(Color.parseColor("#E53935"))
                textView2.text = " "
            }
            else if (ned.isChecked) {
                textView.text = "Right Answer"
                textView2.text = " "
            }
            else if (targarian.isChecked) {
                textView.text = "Wrong Answer"
                textView.setTextColor(Color.parseColor("#FF0000"))
                textView2.text = " "
            }
            else {
                textView.text = " "
                textView2.text = "You have to select any option"
            }

        }


    }
}