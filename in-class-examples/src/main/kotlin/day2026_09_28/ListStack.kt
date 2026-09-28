package day2026_09_28

class ListStack<T>: StackADT<T> {

    private val items = mutableListOf<T>()

    override fun isEmpty(): Boolean {
        return items.isEmpty()
    }
    override fun push(item: T) {
        items.add(item)
    }

    override fun pop(): T {
        if (isEmpty()) {
            throw NoSuchElementException(
                "I'm sorry friend, your stack is empty.")
        }
        return items.removeLast()
    }

    override fun peek(): T {
        if (isEmpty()) {
            throw NoSuchElementException(
                "I'm sorry friend, peeking is bad, your stack is empty.")
        }
     return items[items.count()-1]
    }
}