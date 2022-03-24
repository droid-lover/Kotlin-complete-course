class Calculator {

    fun addition(x: Int, y: Int) : Int{
        return x + y
    }

}

fun main() {
    val calculator = Calculator()
    val output = calculator.addition(x = 10, y = 11)
    println("output is $output")
}