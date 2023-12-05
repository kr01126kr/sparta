package com.example.calculator

fun main() {

    val num1 = 1
    val num2 = 2

    val calc = Calculator(AddOperation())
    println("$num1 더하기 $num2 결과는 : ${calc.againOperation(1, 2)} 입니다")

}