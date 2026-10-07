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
}

fun main() {
    val myList = LinkedUnorderedList<String>()
    myList.tryme()
    myList.addFirst("hi")
    myList.addFirst("bye")
    myList.addFirst("schiller")
}