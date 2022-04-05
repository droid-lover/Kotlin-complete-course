package linkedlist

fun main() {

    val ourLinkedList = OurLinkedList<Int>()

//    ourLinkedList.pushElement(10) //10
//    ourLinkedList.pushElement(20) //20,10
//    ourLinkedList.pushElement(30) //30,20,10

    for (i in 1..10){
        ourLinkedList.pushElement(i)
    }

    println(ourLinkedList)
}