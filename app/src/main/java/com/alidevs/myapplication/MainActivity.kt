package com.alidevs.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.core.view.children

class MainActivity : AppCompatActivity() {
	var questionTextField: TextView? = null
	var questionCounter: TextView? = null
	var radioGroup: RadioGroup? = null
	val questions = mutableListOf<Question>(
		Question("What is the tallest building in Saudi Arabia?",
		listOf("Makkah Clock Royal Tower", "Burj Khalifa", "Burj Rafal", "PIF Tower"),
		"Makkah Clock Royal Tower"),

		Question("When Saudi Arabian National Center for Science & Technology was established?",
		listOf("1977", "1989", "1992", "2000"),
		"1977"),

		Question("When ‘National Museum of Saudi Arabia’ was opened?",
		listOf("2000", "1999", "1998", "1997"),
		"1999"),

		Question("How many Regions are there in Saudi Arabia?",
		listOf("10", "13", "16", "19"),
		"13")
	)

	var currentQuestion = 1
	var currentScore = 0

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// Components
		val clearButton = findViewById<Button>(R.id.clearButton)
		val confirmButton = findViewById<Button>(R.id.confirmButton)
		radioGroup = findViewById(R.id.radioGroup)
		questionTextField = findViewById(R.id.questionTextView)
		questionCounter = findViewById(R.id.questionCounterTextView)
		nextQuestion()

		// Action listeners
		clearButton.setOnClickListener {
			radioGroup!!.clearCheck()
		}

		confirmButton.setOnClickListener {
			val isCorrectAnswer = findViewById<RadioButton>(radioGroup!!.checkedRadioButtonId).text.equals(questions[currentQuestion - 1].correctAnswer)
			if (isCorrectAnswer) {
				Toast.makeText(this, "Correct answer.", Toast.LENGTH_SHORT).show()
				currentScore ++
				currentQuestion ++
				radioGroup!!.clearCheck()
				nextQuestion()
			} else {
				Toast.makeText(this, "Wrong answer! Try again.", Toast.LENGTH_SHORT).show()
			}
		}
	}

	private fun nextQuestion() {
		if (currentQuestion > questions.size) {
			Toast.makeText(this, "Congratulations! You have completed the quiz.", Toast.LENGTH_SHORT).show()
		} else {
			questionTextField!!.text = questions[currentQuestion - 1].question
			for (radioIndex in 0 until radioGroup!!.childCount) {
				val radioButton = findViewById<RadioButton>(radioGroup!!.getChildAt(radioIndex).id)
				radioButton.text = questions[currentQuestion - 1].answers[radioIndex]
			}

			questionCounter!!.text = "$currentQuestion/${questions.size}"
		}
	}
}