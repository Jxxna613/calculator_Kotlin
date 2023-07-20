package com.example.Calculator

class Calculator() {
    val welcome = println("계산기를 실행했습니다.")
    val gate = println("==============================")

    val first = println("첫 번째 숫자를 작성해주세요.")
    var num1 = readLine()!!.toInt()

    val second = println("연산 기호를 작성해주세요.")
    var operator = readLine()!!.toString()

    val last = println("두 번째 숫자를 작성해주세요.")
    var num2 = readLine()!!.toInt()

    fun Operation() {
        if (operator == "+") {
            println("결과는 ${num1 + num2} 입니다.")
        } else if (operator == "-") {
            println("결과는 ${num1 - num2} 입니다.")
        } else if (operator == "*") {
            println("결과는 ${num1 * num2} 입니다.")
        } else if (operator == "/") {
            println("결과는 ${num1 / num2} 입니다.")
        } else if (operator == "%") {
            println("결과는 ${num1 % num2} 입니다.")
        } else {
            println("잘못된 부분이 있습니다. 다시 입력해주세요.")
        }
    }
}