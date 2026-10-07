class ArrayUnorderedList<T> {
    private var array = arrayOfNulls<Any>(10)
    private var usedCount = 0

    
}

fun main() {
    val myList = ArrayUnorderedList<String>()
    println(myList.size())  // I should get 0
    println(myList.addFirst("hello"))
    println(myList.size())  // I should get 1
}