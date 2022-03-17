fun main() {
//Conditional statements
// if else expression ladder(multiple if else statements)

    val temperature = 20
    val clothesToBuy = if (temperature>0 && temperature<=10) {
        "Winter coats"
    } else if( temperature>10 && temperature<=20){
        "Jackets"
    } else if( temperature>20 && temperature<=30){
        "Shirts"
    }else{
        "Tshirts"
    }

    println("You need to purchase $clothesToBuy")
}