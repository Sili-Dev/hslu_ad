package org.hslu.ex_3.binary_search_tree

interface IBinarySearchTree<T : Comparable<T>> {
    fun search(value: T): Boolean
    fun add(value: T)
}