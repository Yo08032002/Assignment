package com.example.assignment

import android.os.Bundle
import android.widget.StackView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var stackView: StackView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stackView = findViewById<StackView>(R.id.idStackView)

        val numberList: MutableList<Int> = ArrayList()
        numberList.add(R.drawable.one)
        numberList.add(R.drawable.two)
        numberList.add(R.drawable.three)

        val stackViewAdapter = StackViewAdapter(this, R.layout.stack_item, numberList)
        stackView?.adapter = stackViewAdapter

    }
}