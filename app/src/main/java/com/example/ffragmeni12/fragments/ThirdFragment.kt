package com.example.ffragmeni12.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.ffragmeni12.R

class ThirdFragment : Fragment(R.layout.fragment_third) {
    private lateinit var texView: TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        texView = view.findViewById(R.id.textView2)

        texView.text = ThirdFragmentArgs.fromBundle(requireArguments()).amount.toString()

    }

}