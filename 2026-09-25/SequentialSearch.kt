// Sequential / linear search

fun findit(list: List<Int>, value: Int): Int {
    for (i in 0 ..< list.count()) {
        if (list[i] == value) {
            return i
        }
    }
    return -1
}
