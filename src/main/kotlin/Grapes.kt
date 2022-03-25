//Child Class
class Grapes : Fruit(){

}

fun main() {
    val grapes = Grapes()

    grapes.name = "GRAPES"
    grapes.color = "GREEN"
    grapes.taste = "bitter_sweet"

    grapes.provideFruitInformation()
}
