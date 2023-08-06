fun main() {
    print("Enter Number 1 : ")
    val num1 = readLine()!!.toDouble()
    print("Enter Number 2 : ")
    val num2 = readLine()!!.toDouble()


    println("Addition of $num1 & $num2 is : ${add(num1, num2)}")
    println("Subtraction of $num1 & $num2 is : ${sub(num1, num2)}")
    println("Multiplication of $num1 & $num2 is : ${mul(num1, num2)}")
    println("Division of $num1 & $num2 is : ${div(num1, num2)}")
}

fun add (a: Double, b: Double): Double = a + b
fun sub (a: Double, b: Double): Double = a - b
fun mul (a: Double, b: Double): Double = a * b
fun div (a: Double, b: Double): Double = a / b