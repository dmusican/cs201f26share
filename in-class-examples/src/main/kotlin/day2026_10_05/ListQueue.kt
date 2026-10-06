package day2026_10_05
//
//class ListQueue<T> {
//
//    var list = mutableListOf<T>()
//    var front = 0
//    var rear = 0
//
//    fun enqueue(item: T) {
//        // Check for full
//        if ((rear + 1) % list.count() == front) {
//            // List needs to be bigger
//            val newList = mutableListOf<T>()
//            var index = front
//            for (i in 0..<list.count()) {
//                newList.add(list[index])
//                index = (index + 1) % list.count()
//            }
//            front = 0
//            rear = newList.count()
//            list = newList
//            // But I need to grow it, and I need something to put in it,
//            // and that is not cleanly done with lists, which is an amazing reason
//            // why I had already planned for Wednesday to cover arrays so we'll
//            // come back to that
//        }
//        // If queue is not full, I want rear to go back to
//        // location 0 if it is at the end of list
//        rear = (rear + 1) % list.count()
//        list[rear] = item
//    }
//
//    fun dequeue(): T {
//        val removedItem = list[front]
//        front = (front + 1) % list.count()
//        return removedItem
//    }
//
//    fun peek(): T // looks
//    // at front
//    fun isEmpty(): Boolean
//    fun size(): Int
//}
