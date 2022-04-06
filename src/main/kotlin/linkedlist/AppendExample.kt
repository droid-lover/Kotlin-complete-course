package linkedlist

fun main() {

    //10,20,30,40
    val ourLinkedList = OurLinkedList<Int>()
    val linkedListBuiltUsingPushOperation =  OurLinkedList<Int>()

//    ourLinkedList.appendElement(10)
//    ourLinkedList.appendElement(20)
//    ourLinkedList.appendElement(30)
//    ourLinkedList.appendElement(40)

//    ourLinkedList.apply {
//        appendElement(10)
//        appendElement(20)
//        appendElement(30)
//        appendElement(40)
//        pushElement(50)
//    }

    for(i in 1..10){
        ourLinkedList.apply {
            appendElement(i)
        }

        linkedListBuiltUsingPushOperation.apply {
            pushElement(i)
        }
    }
    println("Using append  $ourLinkedList")

    println("Using push  $linkedListBuiltUsingPushOperation")
}