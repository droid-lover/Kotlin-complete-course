//Child Class
class Apple : Fruit() {


}

fun main() {

    val apple = Apple()
    apple.name = "APPLE"
    apple.color = "RED"
    apple.taste = "SWEET"

    apple.provideFruitInformation()
}