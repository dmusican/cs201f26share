package day2026_10_07

class LinkedUnorderedList<T> {
    private data class Node<T>(
        var item: T,
        var next: Node<T>?)

    private var head: Node<T>? = null

    fun addFirst(item: T) {
        val newNode = Node<T>(item, head)
        head = newNode
    }

    fun removeFirst() {
        val localHead = head
        if (localHead == null) {
            throw Exception("List is empty, what?")
        } else {
            head = localHead.next
        }
    }

    override fun toString(): String {
        var result = "["
        var current = head
        while (current != null) {
            result = result + current.item.toString() + " "
            current = current.next
        }
        result = result + "]"
        return result
    }
}

fun main() {
    val myList = LinkedUnorderedList<String>()
    myList.addFirst("hi")
    myList.addFirst("bye")
    myList.addFirst("schiller")
    println(myList)
    myList.removeFirst()
    println(myList)
}