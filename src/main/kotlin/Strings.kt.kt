//Strings
fun main(){

    val avenger = "Ironman"
    println(avenger.length)
    println(avenger[0])

    val quote = "I love you 3000"
//    val result = avenger + quote

    //with string concatenation
    val result = "My favourite avenger is $avenger and $quote"
    println(result)


    //Multi line strings
    val sentence = """
        this is a multi line string
        we can continuously write the data here
        in many lines
    """.trimIndent()

    println(sentence)



}