class ArrayUnorderedList<T> {
    private var array = arrayOfNulls<Any>(10)
    private var usedCount = 0

    fun addFirst(item: T) {
        for (i in usedCount downTo 1) {
            array[i] = array[i-1]
        }
        array[0] = item
    }
}

fun main() {
    val myList = ArrayUnorderedList<String>()
//    println(myList.size())  // I should get 0
    println(myList.addFirst("hello"))
//    println(myList.size())  // I should get 1
}