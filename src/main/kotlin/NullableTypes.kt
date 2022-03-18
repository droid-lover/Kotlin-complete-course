//Null Safety and Nullable Types
fun main() {


    var car :String? = null

    //traditional way
//    if(car != null){
//        println("car name is $car")
//    }else{
//        println("car name is null")
//    }

    //Using elvis operator
    car = "Audi"
    println( car ?: "Null" )





}



















