package day2026_10_14

// Solver for Towers of Hanoi puzzle

fun move(numDiscs: Int, start: Int, end: Int, temp: Int) {
    if (numDiscs == 1) {
        println("Move disc from $start to $end")
    } else {
        move(numDiscs-1, start, temp, end)
        println("Move disc from $start to $end")
        move(numDiscs-1, temp, end, start)
    }
}

fun main() {
    move(3, 1, 3, 2)
}