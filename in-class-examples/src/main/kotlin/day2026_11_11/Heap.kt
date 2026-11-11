package day2026_11_11

class Heap<T: Comparable<T>> {
    val heaplist = mutableListOf<T>()

    private fun swap(index1: Int, index2: Int) {
        val temp = heaplist[index1]
        heaplist[index1] = heaplist[index2]
        heaplist[index2] = temp
    }

    fun insert(item: T) {
        // Put in the next spot on bottom of tree
        heaplist.add(item)
        // swap if need be with parent, all the way up
        var currentIndex = heaplist.count() - 1

        while (currentIndex > 0) {
            val parentIndex = (currentIndex - 1) / 2   // integer division, rounds down automatically
            if (heaplist[currentIndex] < heaplist[parentIndex]) {
                swap(currentIndex, parentIndex)
                currentIndex = parentIndex
            } else {
                // if no swap, then done
                break
            }
        }
    }
}
