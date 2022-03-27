fun main() {

    //List

    val numbersList = listOf(1,2,3,4,5,6,7)

    val updatableNumbersList = mutableListOf(1,2,3,4,5,6,7)
    updatableNumbersList.add(8)
    updatableNumbersList.add(9)
    updatableNumbersList.add(0,0)

    println(updatableNumbersList.size)

//    for (digit in updatableNumbersList){
//        println(digit)
//    }

    updatableNumbersList.forEach {
        println(it)
    }
}