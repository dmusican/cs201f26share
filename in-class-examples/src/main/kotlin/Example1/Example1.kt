package Example1

class Salary {
    var annual: Double? = null

    fun giveRaise(percent: Double) {
        annual = annual!! + annual!! * percent
    }
//    fun giveRaise(percent: Double) {
//        val annualCopy = annual
//        if (annualCopy != null) {
//            annual = annualCopy + annualCopy * percent
//        } else {
//            // do nothing
//        }
//    }
}

fun main() {
    val pay = Salary()
    pay.annual = 100.0
    println(pay.annual)
    pay.giveRaise(0.8)
}