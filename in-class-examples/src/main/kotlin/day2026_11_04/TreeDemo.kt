package day2026_11_04

import sun.reflect.generics.tree.Tree

data class TreeNode<T>(var data: T,
                       var leftChild: TreeNode<T>? = null,
                       var rightChild: TreeNode<T>? = null)

fun <T> displayTree(current: TreeNode<T>?, numSpaces: Int = 0) {
    if (current == null) {
        return
    } else {
        displayTree(current.rightChild, numSpaces + 2)
        println(" ".repeat(numSpaces) + current.data)
        displayTree(current.leftChild, numSpaces + 2)
        ver
    }
}

fun main() {
    val root = TreeNode("Susan")
    val luisNode = TreeNode("Luis")
    root.leftChild = luisNode
    luisNode.leftChild = TreeNode("Adam")
    val carlNode = TreeNode("Carl")
    root.rightChild = carlNode
    root.rightChild!!.leftChild = TreeNode("Kim")
    root.rightChild!!.rightChild = TreeNode("Beth")

    displayTree(root)
}