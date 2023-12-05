package com.example.calculator

class Calculator(private val operation: AddOperation) {
    fun againOperation(num1: Int, num2: Int): Double {
        return operation.operate(num1, num2)
    }
}
