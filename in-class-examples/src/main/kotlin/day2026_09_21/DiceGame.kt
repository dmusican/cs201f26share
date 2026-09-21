package day2026_09_21

class Die(var sides: Int) {

    // Other arbitrary startup code
    init {
        println("I am init!!!!! ???")
        // Die should always get set to a random value
        roll()
    }
    var showing = 1
    var color: String? = null

    fun roll() {
        showing = (1..sides).random()
    }

    constructor(): this(6) {
        println("I am a constructor. Hear me roar.")
    }

    constructor(sides: Int, color: String): this(sides) {
        println("I am a constructor with no parameters.")
        println("Color is $color")
        this.color = color
    }
}

fun main() {
//    val die1 = Die(20)
//    println(die1.sides)
//    println(die1.showing)
//    die1.roll()
//    println(die1.showing)

    val die3 = Die()
    println(die3.sides)

//    val die2 = Die(12)
//    println(die2.sides)
}