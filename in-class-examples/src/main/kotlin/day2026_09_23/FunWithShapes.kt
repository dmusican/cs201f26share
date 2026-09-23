package day2026_09_23

class Rectangle(var length: Double, var width: Double) {
    fun area(): Double {
        return length * width
    }
}

class Circle(var radius: Double) {
    fun area(): Double {
        return Math.PI * radius * radius
    }
}

fun main() {
    print("(r)ectangle or (c)ircle? ")
    val choice = readln()
    if (choice == "r") {
        val r = Rectangle(10.0, 10.0)
        println(r.area())
    } else {
        val c = Circle(35.0)
        println(c.area())
    }
}