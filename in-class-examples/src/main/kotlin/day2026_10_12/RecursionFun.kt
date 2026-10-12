package day2026_10_12

fun factorial(n: Int): Int {
    // base case
    if (n == 1) {
        return 1
    } else {
        return n * factorial(n-1)
    }
}

fun sumup(nums: List<Int>): Int {
    if (nums.count() == 0) {
        return 0
    } else {
        return nums[0] + sumup(nums.subList(1, nums.count()))
    }
}

fun main() {
    println(factorial(4))
    println(sumup(listOf(10, 2, 3, 5)))
}