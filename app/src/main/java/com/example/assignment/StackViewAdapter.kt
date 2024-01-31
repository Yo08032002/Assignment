package com.example.assignment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView

class StackViewAdapter(
    private val context: Context,
    numbersList1: Int,
    private val numbersList: List<Int>
) : ArrayAdapter<Any?>(context, R.layout.stack_item) {

    override fun getCount(): Int {
        return numbersList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.context).inflate(R.layout.stack_item, parent, false)
        }

        val imageView = convertView!!.findViewById<ImageView>(R.id.image)
        imageView.setImageResource(numbersList[position])

        return convertView
    }
}
