package Example2

class Salary(var annual: Double?) {
//    var annual: Double? = null

    fun giveRaise(percent: Double) {
        val annualCopy = annual
        if (annualCopy != null) {
            annual = annualCopy + annualCopy * percent
        } else {
            // do nothing
        }
    }
}

fun main() {
    val pay = Salary(100.0)
    println(pay.annual)
    pay.giveRaise(0.8)
}
