package com.example.Calculator

import com.example.calculator.AddOperation
import com.example.calculator.DivideOperation
import com.example.calculator.MultiplyOperation
import com.example.calculator.SubstractOperation

fun main() {
    val welcome = println("계산기를 실행합니다.")
    val gate = println("==============================")

    val first = println("첫 번째 숫자를 작성해주세요.")
    val num1 = readLine()!!.toInt()

    val write = println("연산 기호를 작성해주세요.")
    val operator = readLine()!!.toString()

    val second = println("두 번째 숫자를 작성해주세요.")
    val num2 = readLine()!!.toInt()

    val addOperation = AddOperation()
    val result = addOperation.operate(num1, num2)
    val last = "$num1 $operator $num2 의 값은 ${result}입니다."

    val substractOperation = SubstractOperation()
    val result2 = substractOperation.operate(num1, num2)
    val lasta = "$num1 $operator $num2 의 값은 ${result2}입니다."

    val multiplyOperation = MultiplyOperation()
    val result3 = multiplyOperation.operate(num1, num2)
    val lastb = "$num1 $operator $num2 의 값은 ${result3}입니다."

    val divideOperation = DivideOperation()
    val result4 = divideOperation.operate(num1, num2)
    val lastc = "$num1 $operator $num2 의 값은 ${result4}입니다."

    when (operator) {
        "+" -> {
            println("$last")
        }
        "-" -> {
            println("$lasta")
        }
        "*" -> {
            println("$lastb")
        }
        "/" -> {
            println("$lastc")
        }
    }
}


