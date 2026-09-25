// Sequential / linear search

fun findit(list: List<Int>, value: Int): Int {
    for (i in list.indices) {
        if (list[i] == value) {
            return i;
        }
    }
    return -1;
}
