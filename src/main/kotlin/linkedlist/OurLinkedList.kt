package linkedlist
/**
 * create by Sachin Rajput
 * (Native Mobile Bits)
 */

class OurLinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size: Int = 0

    fun isOurLinkedListEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isOurLinkedListEmpty()) {
            "Our Linkedlist is empty"
        } else {
            head.toString()
        }
    }

    fun pushElement(value: T) {
        head = Node(value, nextNode = head)
        if(tail == null){
            tail = head
        }
        size+=1
    }
}