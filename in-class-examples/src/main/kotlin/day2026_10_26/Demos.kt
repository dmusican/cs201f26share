package day2026_10_26

fun main() {
    val numbersMap = mutableMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3)
    println(numbersMap["one"])
    numbersMap["four"] = 4
    println(numbersMap["four"])
}