package day2026_10_12

fun factorial(n: Int): Int {
    // base case
    if (n == 1) {
        return 1
    } else {
        return n * factorial(n-1)
    }
}

fun main() {
    println(factorial(4))
}