package day2026_09_28

// T is a "generic type"; I can pick letter (or word) I want
// T is common as an abbreviation for "type"
interface StackADT<T> {
    fun push(item: T)
    fun pop(): T
//    fun peek(): T
    fun isEmpty(): Boolean
//    fun size(): Int
}