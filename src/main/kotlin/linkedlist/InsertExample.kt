package linkedlist

fun main() {

    //10,20,30
    val ourLinkedList = OurLinkedList<Int>()

    ourLinkedList.appendElement(10) //10
    ourLinkedList.appendElement(20) //10,20
    ourLinkedList.appendElement(30) //10,20,30

//    println( ourLinkedList.findNodeAt(givenIndex = 0)?.value)//10

    val afterNodeReference = ourLinkedList.findNodeAt(givenIndex = 1)
//    if (afterNodeReference != null) {
//        ourLinkedList.insertElement(value = 40, afterNode = afterNodeReference)
//    }

    afterNodeReference?.also {
        ourLinkedList.insertElement(value = 40, afterNode = it)
    }

    println(ourLinkedList)

}