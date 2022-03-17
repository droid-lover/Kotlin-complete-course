fun main() {
//Conditional statements
// if else expression (replacement for ternary operator in Kotlin)

//    val number = 4
    val number = 5
    val result = if (number %2 == 0) {
        "EVEN"
    } else {
        "ODD"
    }

    println("Number $number is $result")
}