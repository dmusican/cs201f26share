package day2026_11_04

import sun.reflect.generics.tree.Tree

data class TreeNode<T>(var data: T,
                       var leftChild: TreeNode<T>? = null,
                       var rightChild: TreeNode<T>? = null)

fun main() {
    val root = TreeNode("Susan")
    val luisNode = TreeNode("Luis")
    root.leftChild = luisNode
    luisNode.leftChild = TreeNode("Adam")
    val carlNode = TreeNode("Carl")
    root.rightChild = carlNode
    root.rightChild.leftChild = TreeNode("Kim")
    root.rightChild.rightChild = TreeNode("Beth")
}