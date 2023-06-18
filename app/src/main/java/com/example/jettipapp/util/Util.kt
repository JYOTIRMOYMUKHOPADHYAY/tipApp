package com.example.jettipapp.util


fun calculateTotalTip(totalBIll: Double, tipPercentage: Int): Double {

    return if(totalBIll > 1 && totalBIll.toString().isNotEmpty()) (totalBIll * tipPercentage) /100 else 0.0

}

fun calculateTotalPerPerson(totalBIll: Double,splitBy: Int, tipPercentage: Int): Double {

    val bill = calculateTotalTip(totalBIll = totalBIll, tipPercentage = tipPercentage) + totalBIll
    return (bill/splitBy)

}