package linkedlist

fun main() {

    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)
//    val node4 = Node(value = 4)

    node1.nextNode = node2
    node2.nextNode = node3
//    node3.nextNode = node4

    println(node1)
}