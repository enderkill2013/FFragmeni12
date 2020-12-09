package com.example.ffragmeni12.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ffragmeni12.R

class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var navController: NavController

    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        editText = view.findViewById(R.id.editTextNumber)
        button = view.findViewById(R.id.button)

        //meore fragmentze gadagvyavs informacia
        button.setOnClickListener {
            val amount = editText.text.toString().toInt()//davaimportiret intad textidan tostringshi

            val action = FirstFragmentDirections.actionFirstFragmentToThirdFragment2(amount)

            navController.navigate(action)
        }


    }


}