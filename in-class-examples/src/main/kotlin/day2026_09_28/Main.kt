package day2026_09_28

fun main() {
    val myStack = ListStack<String>()
    myStack.push("hello")
    myStack.push("schiller")
    println(myStack.size())
    println(myStack.peek())
    println(myStack.pop())
    println(myStack.pop())
    //println(myStack.pop())

    val yourStack = ListStack<Int>()
    yourStack.push(3)
    yourStack.push(5)
}