package com.nikolai.adepttestproject.calculator

class CalculatorModel {
    private var currentFirstString = ""
    private var currentSecondString = ""

    fun plus(): Int{
        checkParameters()
        return currentFirstString.toInt() + currentSecondString.toInt()
    }
    fun minus(): Int{
        checkParameters()
        return currentFirstString.toInt() - currentSecondString.toInt()
    }
    fun umno(): Int{
        checkParameters()
        return currentFirstString.toInt() * currentSecondString.toInt()
    }
    fun delen(): Float{
        checkParameters()
        if (currentSecondString.toInt() != 0) {
            return currentFirstString.toFloat() / currentSecondString.toFloat()
        }
        else
        {
            throw Exception("Error")
        }
    }
    fun updateFirstNumber(firstNumber:String)
    {
        currentFirstString = firstNumber
    }
    fun updateSecondNumber(secondNumber:String)
    {
        currentSecondString = secondNumber
    }
    fun checkParameters()
    {
        if(currentFirstString=="" || currentSecondString=="")
        {
            throw Exception ("Введи число, дурак")
        }
    }
}