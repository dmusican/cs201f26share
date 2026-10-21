package day2026_10_21

fun <T: Comparable<T>> isFirstGreater(x: T, y: T): Boolean {
    if (x > y ) {
        return true
    } else {
        return false
    }
}

data class Thing(val x: Int)

fun main() {
    print(isFirstGreater(3, 5))
    print(isFirstGreater("Dave", "Marker"))
    print(isFirstGreater(9.2, 6.5))

}






