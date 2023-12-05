package com.example.calculator


fun main() {


    println("실행할 연산을 선택하세요")
    println("[1]덧셈 [2]뺄셈 [3]곱셈 [4]나눗셈 [5]나누고나머지")
    var operator = readLine()!!.toInt()

    println("첫번째 숫자를 입력하세요")
    var num1 = readLine()!!.toInt()

    println("두번째 숫자를 입력하세요")
    var num2 = readLine()!!.toInt()



    when (operator) {
        1 -> {
            var plusResult = num1 + num2
            println("${num1} + ${num2}는 ${plusResult}이야")
        }

        2 -> {
            var minusResult = num1 - num2
            println("${num1} - ${num2}는 ${minusResult}이야")
        }

        3 -> {
            var multipleResult = num1 * num2
            println("${num1} * ${num2}는 ${multipleResult}이야")
        }

        4 -> {
            var divideResult = num1 / num2
            println("${num1} / ${num2}는 ${divideResult}이야")
        }

        5 -> {
            var modResult = num1 % num2
            println("${num1} % ${num2}는 정수로 ${modResult}야")
        }

        else -> {
            println("제시된 연산중에 선택하세요")
        }
    }

}