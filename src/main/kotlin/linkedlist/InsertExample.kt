package linkedlist

fun main() {

    //10,20,30
    val ourLinkedList = OurLinkedList<Int>()

    ourLinkedList.appendElement(10) //10
    ourLinkedList.appendElement(20) //10,20
    ourLinkedList.appendElement(30) //10,20,30

    println(ourLinkedList.findNodeAt(givenIndex = 0)?.value)

}