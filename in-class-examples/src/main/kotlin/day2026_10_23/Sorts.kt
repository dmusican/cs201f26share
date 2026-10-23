package day2026_10_23

import kotlin.random.Random

fun <T> swap(list: MutableList<T>, i: Int, j: Int) {
    val temp = list[i]
    list[i] = list[j]
    list[j] = temp
}

fun <T: Comparable<T>> selectionsort(array: MutableList<T>) {
    for (i in 0..<array.count()) {
        var smallestPos = i
        for (j in (i+1)..<array.count()) {
            if (array[j] < array[smallestPos]) {
                smallestPos = j
            }
        }
        swap(array, i, smallestPos)
    }
}

fun <T: Comparable<T>> merge(list: MutableList<T>, tempList: MutableList<T>,
                             leftStart: Int, rightStart: Int, rightEnd: Int) {
    val leftEnd = rightStart - 1
    var cur = 0    // Current location in temp
    var left = leftStart
    var right = rightStart

    // Start merging until one of the halves is exhausted
    while (left <= leftEnd && right <= rightEnd) {
        if (list[left] <= list[right]) {
            tempList[cur] = list[left]
            left++
        } else {
            tempList[cur] = list[right]
            right++
        }
        cur++
    }

    // Copy rest of first half
    while (left  <= leftEnd) {
        tempList[cur] = list[left]
        cur++
        left++
    }

    // Copy rest of second half
    while (right <= rightEnd) {
        tempList[cur] = list[right]
        cur++
        right++
    }

    // Copy temp array over original array
    for (i in 0..<rightEnd - leftStart + 1)
        list[leftStart+i] = tempList[i]
}

fun <T: Comparable<T>> mergesort(list: MutableList<T>, tempList: MutableList<T>, left: Int, right: Int)
{
    if (left < right) {
        val center = (left + right) / 2
        mergesort(list, tempList, left, center)
        mergesort(list, tempList, center+1, right)
        merge(list, tempList, left, center+1, right)
    }
}

fun <T: Comparable<T>> mergesort(list: MutableList<T>) {
    val tempList = list.toMutableList()    // cheap way to make a list of the right size
    mergesort(list,tempList,0,list.count()-1)
}

fun <T: Comparable<T>> _quicksort(list: MutableList<T>, start: Int, stop: Int) {
    if (start < stop) {
        val pivot = list[start]
        var left = start+1
        var right = stop

        while (left < right) {
            while (left < stop && list[left] < pivot) {
                left++
            }

            while (right > start && list[right] > pivot) {
                right--
            }

            if (left < right) {
                swap(list,left,right)
            }
        }

        // Move pivot to the middle. right is now at the rightmost spot less
        // than or equal to pivot.
        swap(list,start,right)

        _quicksort(list,start,right-1)
        _quicksort(list,right+1,stop)
    }
}

fun <T: Comparable<T>> quicksort(list: MutableList<T>) {
    _quicksort(list, 0, list.count()-1)
}

fun <T> shuffle(list: MutableList<T>) {
    val rand = Random(55057)
    for (i in 0..<1000000) {
        val spot1 = rand.nextInt(list.count())
        val spot2 = rand.nextInt(list.count())
        swap(list,spot1,spot2)
    }
}

fun main() {
    val size = 1000
    val list = mutableListOf<Int>()
    for (i in 0..<size) {
        list.add(i)
    }
    shuffle(list)
    println(list.subList(0, 100))
    println()
    println()
    selectionsort(list)

    println();
    println();
    println(list.subList(0, 100))

    for (i in 0..<size) {
        assert(list[i] == i)
    }
}
