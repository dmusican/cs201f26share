package day2026_11_09

class BSTSet<T: Comparable<T>> {

    private data class Node<T>(
        var key: T,
        var left: Node<T>? = null,
        var right: Node<T>? = null)

    private var root: Node<T>? = null

    fun insert(item: T) {
        root = insertIntoSubtree(item, root)
    }
    // returns a NEW TREE, which is the result of inserting
    // the value into the old tree
    private fun insertIntoSubtree(item: T, treeNode: Node<T>?): Node<T> {
        if (treeNode == null) {
            return Node<T>(item)
        } else if (item < treeNode.key) {
            treeNode.left = insertIntoSubtree(item, treeNode.left)
        } else if (item > treeNode.key){
            treeNode.right = insertIntoSubtree(item, treeNode.right)
        } else {
            throw Exception("already present")
        }

        return treeNode
    }

    // Test to see if tree contains something
    private fun containsInSubtree(item: T, treeNode: Node<T>?): Boolean {
        if (treeNode == null) {
            return false
        } else if (item < treeNode.key) {
            return containsInSubtree(item, treeNode.left)
        } else if (item > treeNode.key) {
            return containsInSubtree(item, treeNode.right)
        } else {
            return true
        }
    }

    fun contains(item: T): Boolean {
        return containsInSubtree(item, root)
    }
}

fun main() {
    val set = BSTSet<Int>()
    set.insert(15)
    set.insert(8)
    set.insert(11)
    set.insert(38)
    println(set.contains(15))
    println(set.contains(38))
    println(set.contains(97))

}