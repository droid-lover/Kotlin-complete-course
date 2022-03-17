fun main() {
//Conditional statements
// when expression ladder(multiple if else statements)

    val temperature = 34
    val clothesToBuy = when (temperature) {
        in 1..10 -> {
            "Winter coats"
        }
        in 11..20 -> {
            "Jackets"
        }
        in 21..30 -> {
            "Shirts"
        }
        else -> {
            "Tshirts"
        }
    }

    println("You need to purchase $clothesToBuy")
}