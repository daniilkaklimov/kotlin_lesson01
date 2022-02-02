package ru.klimov.kotlin_lesson1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView: TextView = findViewById(R.id.textView)
        val carTextView: TextView = findViewById(R.id.carTextView)
        val button: Button = findViewById(R.id.button)
        val buttonPerson: Button = findViewById(R.id.button_person)


        val car = object {
            var model = "Ford"
            var color = "Black"
        }

        carTextView.text = "Car model: ${car.model}, Car color: ${car.color}"

        button.setOnClickListener {
            textView.text = "Тык засчитан!"

        }

        buttonPerson.setOnClickListener {
            val intent = Intent(this, PersonOutput::class.java)
            startActivity(intent)
        }

        for (i in 1..5) {
            Log.d("CYCLES", "Цикл 1: $i")
        }

        var q = 1
        while (q < 9) {
            println(q)
            q++
        }
        Log.d("CYCLES", "Цикл 2: $q")

    }
}
