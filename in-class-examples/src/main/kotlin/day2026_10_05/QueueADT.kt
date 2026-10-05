package day2026_10_05

interface QueueADT<T> {
    fun enqueue(item: T) // adds at rear, think of as "getting on line at the back"
    fun dequeue(): T // retrieves and removes from front
    fun peek(): T // looks at front
    fun isEmpty(): Boolean
    fun size(): Int
}
