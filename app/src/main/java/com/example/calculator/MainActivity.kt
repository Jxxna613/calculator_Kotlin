fun main() {
    Calculator().Operation()
}

open class Calculator() {
    val print = "숫자와 연산기호를 작성해주세요."
    var num1 = readLine()!!.toInt()
    var operator = readLine()!!.toString()
    var num2 = readLine()!!.toInt()

    fun Operation() {
        if(operator == "+") {
            println(num1 + num2)
        } else if(operator == "-") {
            println(num1 - num2)
        } else if(operator == "*") {
            println(num1 * num2)
        } else if(operator == "/") {
            println(num1 / num2)
        }
    }

}