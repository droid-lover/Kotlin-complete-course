package linkedlist

data class Node<T> (var value:T , var nextNode: Node<T>?=null){

    override fun toString(): String {
        return if(nextNode !=null){
            "$value -> ${nextNode.toString()}"
        }else{
            "$value"
        }
    }
}