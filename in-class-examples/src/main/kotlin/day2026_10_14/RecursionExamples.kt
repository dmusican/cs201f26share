package day2026_10_14

// Solver for Towers of Hanoi puzzle

fun move(numDiscs: Int, start: Int, end: Int, temp: Int) {
    if (numDiscs == 1) {
        println("Move disc from $start to $end")
    }
}

fun main() {
    move(1, 1, 3, 2)
}