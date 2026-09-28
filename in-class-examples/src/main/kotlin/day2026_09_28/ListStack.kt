package day2026_09_28

class ListStack<T>: StackADT<T> {

    private val items = mutableListOf<T>()

    override fun isEmpty(): Boolean {
        return items.isEmpty()
    }
    override fun push(item: T) {
        if (isEmpty()) {
            throw NoSuchElementException(
                "I'm sorry friend, your stack is empty.")
        }
        items.add(item)
    }

    override fun pop(): T {
        return items.removeLast()
    }
}