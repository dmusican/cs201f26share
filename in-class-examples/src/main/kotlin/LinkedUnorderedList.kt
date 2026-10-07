class LinkedUnorderedList<T> {
    private data class Node<T>(
        var item: T,
        var next: Node<T>?)

    fun tryme() {
        val thing = Node<String>("hi", null)
        println(thing)
    }
}

fun main() {
    val myList = LinkedUnorderedList<String>()
    myList.tryme()
}