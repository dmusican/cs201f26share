package Example1

class Salary {
    var annual: Double? = null
}

fun main() {
    val pay = Salary()
    pay.annual = 100.0
    println(pay.annual)
}