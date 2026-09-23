package day2026_09_23

interface Shape {
    fun area(): Double
}

class Rectangle(var length: Double, var width: Double): Shape {
    override fun area(): Double {
        return length * width
    }
}

class Circle(var radius: Double): Shape {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

fun main() {
    print("(r)ectangle or (c)ircle? ")
    val choice = readln()
    var s: Shape
    if (choice == "r") {
        s = Rectangle(10.0, 10.0)
    } else {
        s = Circle(35.0)
    }
    println(s.area())
}