package day2026_09_21

class Die(var sides: Int) {

    var showing = 1

    fun roll() {
        showing = (1..sides).random()
    }

    constructor(): this(6) {
        println("I am a constructor. Hear me roar.")
    }
}

fun main() {
    val die1 = Die(20)
    println(die1.sides)
    println(die1.showing)
    die1.roll()
    println(die1.showing)

    val die3 = Die()

//    val die2 = Die(12)
//    println(die2.sides)
}