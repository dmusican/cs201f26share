package day2026_10_07

class ArrayUnorderedList<T> {
    private var array = arrayOfNulls<Any>(10)
    private var usedCount = 0

    fun addFirst(item: T) {
        if (usedCount == array.count()) { // the array is full {
        // new array, twice as big, first half has old contents
            array = array.copyOf(array.count() * 2)
        }
        for (i in usedCount downTo 1) {
            array[i] = array[i-1]
        }
        array[0] = item
        usedCount++
    }

    override fun toString(): String {
        var result = "["
        for (i in 0..<usedCount) {
            result = result + array[i].toString() + " "
        }
        result = result + "]"
        return result
    }
}

fun main() {
    val myList = ArrayUnorderedList<String>()
//    println(myList.size())  // I should get 0
    myList.addFirst("hello")
    myList.addFirst("bye")
    myList.addFirst("schiller")

    val numList = ArrayUnorderedList<Int>()
    for (i in 0..<1000) {
        numList.addFirst(i)
    }

//    println(myList.size())  // I should get 1
    println(numList)
}