package day2026_10_05

class ListQueue<T> {

    var list = mutableListOf<T>()
    var front = 0
    var rear = 0

    fun enqueue(item: T) {
        // If queue is not full, I want rear to go back to
        // location 0 if it is at the end of list
        if (rear == list.count() - 1) {
            rear = 0
        }
        else {
            rear = rear + 1
        }
        list[rear] = item
    }

    fun dequeue(): T {
        val removedItem = list[front]
        front = front + 1
        return removedItem
    }
    fun peek(): T // looks
    // at front
    fun isEmpty(): Boolean
    fun size(): Int
}
