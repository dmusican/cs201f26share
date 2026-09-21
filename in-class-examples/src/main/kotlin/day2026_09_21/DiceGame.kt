package day2026_09_21

class Die(var sides: Int) {

}

fun main() {
    val die1 = Die(20)
    println(die1.sides)

    val die2 = Die(12)
    println(die2.sides)
}