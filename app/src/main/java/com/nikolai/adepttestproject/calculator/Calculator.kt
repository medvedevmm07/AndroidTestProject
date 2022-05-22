package com.nikolai.adepttestproject.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nikolai.adepttestproject.R

class Calculator : Fragment() {
    private val viewModel = CalculatorModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.fragment_start, container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstNumber = view.findViewById<EditText>(R.id.firstNumberInput)
        val secondNumber = view.findViewById<EditText>(R.id.secondNumberInput)

        val Minus = view.findViewById<Button>(R.id.buttonMinus)
        Minus.setOnClickListener {
            try {
                val answer = viewModel.minus()
                view.findViewById<TextView>(R.id.answerExit).text = answer.toString()
            }
            catch(error: Exception) {
                view.findViewById<TextView>(R.id.answerExit).text = error.message
            }
        }
        val Plus = view.findViewById<Button>(R.id.buttonPlus)
        Plus.setOnClickListener {
            try {
                val answer = viewModel.plus()
                view.findViewById<TextView>(R.id.answerExit).text = answer.toString()
            }
            catch(error: Exception) {
                view.findViewById<TextView>(R.id.answerExit).text = error.message
            }
        }
        val Umno = view.findViewById<Button>(R.id.umno)
        Umno.setOnClickListener {
            try {
                val answer = viewModel.umno()
                view.findViewById<TextView>(R.id.answerExit).text = answer.toString()
            }
            catch(error: Exception) {
                view.findViewById<TextView>(R.id.answerExit).text = error.message
            }
        }
        val Delen = view.findViewById<Button>(R.id.delen)
        Delen.setOnClickListener {
            try {
                val answer = viewModel.delen()
                view.findViewById<TextView>(R.id.answerExit).text = answer.toString()
            }
            catch(error: Exception) {
                view.findViewById<TextView>(R.id.answerExit).text = error.message
            }
        }
        firstNumber.addTextChangedListener { fieldValue ->
            viewModel.updateFirstNumber(fieldValue.toString())
        }
        secondNumber.addTextChangedListener { fieldValue ->
            viewModel.updateSecondNumber(fieldValue.toString())
        }
    }
}