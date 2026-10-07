class LinkedUnorderedList<T> {
    private data class Node<T>(
        var item: T,
        var next: Node<T>?)

    private var head: Node<T>? = null

    fun tryme(){
        val thing = Node<String>("hi", null)
        println(thing)
    }

    fun addFirst(item: T) {
        val newNode = Node<T>(item, head)
        head = newNode
    }

    override fun toString(): String {
        var result = "["
        var current = head
        while (current != null) {
            result = result + current.item.toString()
            current = current.next + " "
        }
        result = result + "]"
        return result
    }
}

fun main() {
    val myList = LinkedUnorderedList<String>()
    myList.tryme()
    myList.addFirst("hi")
    myList.addFirst("bye")
    myList.addFirst("schiller")
    println(myList)
}