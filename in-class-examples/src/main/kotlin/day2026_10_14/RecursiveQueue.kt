package day2026_10_14

class RQueue<T> {
    var front: T? = null
    var rear: T? = null
    var inside: RQueue<T>? = null

    fun enqueue(value: T) {
        if (front == null) { // queue empty
            front = value
        } else if (rear == null) { // queue is one item (in front)
            rear = value
        } else {   // need to add to internal queue
            if (inside == null) {
                inside = RQueue<T>()
            }
            inside!!.enqueue(rear!!)
            rear = value
        }
    }
}

fun main() {
    val q = RQueue<String>()
    q.enqueue("alex")
    q.enqueue("kylah")
    q.enqueue("bruce")
}