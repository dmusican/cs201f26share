package day2026_09_28

class ListStack<T>: StackADT<T> {

    private val items = mutableListOf<T>()

    override fun push(item: T) {
        items.add(item)
    }

    override fun pop(): T {
        return items.removeLast()
    }
}