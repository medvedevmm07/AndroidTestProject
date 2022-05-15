package com.nikolai.adepttestproject.firstScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nikolai.adepttestproject.R

class FirstScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val calbutton = view.findViewById<Button>(R.id.calculatorbutton)
        calbutton.setOnClickListener {
            findNavController().navigate(R.id.action_firstScreen_to_calculator)
        }
    }
}