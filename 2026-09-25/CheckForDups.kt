// Look for duplicate values

fun checkForDups(list: List<Int>): Boolean {
    for (i in 0 ..< list.count()) {
        for (j in 0 ..< list.count()) {
            if (list[i] == list[j] && i != j) {
                return true
            }
        }
    }
    return false
}
