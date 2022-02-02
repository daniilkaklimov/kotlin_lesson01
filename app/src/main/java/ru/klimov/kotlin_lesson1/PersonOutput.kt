package ru.klimov.kotlin_lesson1

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class PersonOutput : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.person_output)

        val firstPersonTextView: TextView = findViewById(R.id.firstPerson)
        val secondPersonText: TextView = findViewById(R.id.secondPerson)
        val thirdPersonText: TextView = findViewById(R.id.thirdPerson)

        val tom: Person = Person("Tom", "Tomov", 21)
        val bob: Person = Person("Bob", "Bobov", 30)
        val jho: Person = Person("Jho", "Jhosh", 42)

        val printTom =
            "Person name: ${tom.Name}, Person surname: ${tom.Surname}, Person age: ${tom.Age}"
        val printBob =
            "Person name: ${bob.Name}, Person surname: ${bob.Surname}, Person age: ${bob.Age}"
        val printJho =
            "Person name: ${jho.Name}, Person surname: ${jho.Surname}, Person age: ${jho.Age}"

        firstPersonTextView.text = printTom
        secondPersonText.text = printBob
        thirdPersonText.text = printJho

    }
}