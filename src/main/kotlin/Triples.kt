fun main() {

    //Triples
    val date = Triple<String,String,String>("Day","Month","Year")
    val dateValue = Triple(7,1,2002)

    println("${date.first} = ${dateValue.first}")
    println("${date.second} = ${dateValue.second}")
    println("${date.third} = ${dateValue.third}")

}