fun main() {
//Conditional statements
// when expression ladder(multiple if else statements)

    val temperature = 34
    val clothesToBuy = when {
        temperature>0 && temperature<=10 -> {
            "Winter coats"
        }
        temperature>10 && temperature<=20 -> {
            "Jackets"
        }
        temperature>20 && temperature<=30 -> {
            "Shirts"
        }
        else -> {
            "Tshirts"
        }
    }

    println("You need to purchase $clothesToBuy")
}