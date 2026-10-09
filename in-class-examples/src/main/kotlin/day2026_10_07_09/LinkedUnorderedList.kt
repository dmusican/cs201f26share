package day2026_10_07_09

class LinkedUnorderedList<T> {
    private data class Node<T>(
        var item: T,
        var next: Node<T>?)

    private var head: Node<T>? = null

    fun get(position: Int): T {
        if (position < 0) {
            throw Exception("Negative position, how dare you!?")
        }
        var current = head
        for (i in 0..<position) {
            if (current == null) {
                throw Exception("Position too big, wtf?")
            } else {
                current = current.next
            }
        }
        if (current == null) {
            throw Exception("List has no more items")
        }
        return current.item
    }

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

    fun removeAt(position: Int) {
        if (position < 0) {
            throw Exception("Negative position bad")
        }

        if (position == 0) {
            removeFirst()
        }

        var current = head
        for (i in 0..<position-1) {
            if (current == null) {
                throw Exception("pos too big")
            }
            current = current.next
        }
        if (current == null) {
            throw Exception("no more items")
        }
        val followingItem = current.next
        if (followingItem == null) {
            throw Exception("no more items")
        }
        current.next = followingItem.next
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
//    myList.removeFirst()
    println(myList)
    println("At loc 0: ${myList.get(0)}")
//    println("At loc 2: ${myList.get(2)}")
    myList.removeAt(2)
    println(myList)
}