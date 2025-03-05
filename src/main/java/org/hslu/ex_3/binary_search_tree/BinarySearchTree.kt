package org.hslu.ex_3.binary_search_tree

import org.slf4j.LoggerFactory.getLogger
import java.util.Objects

class BinarySearchTree<T : Comparable<T>>(private val rootNode: TreeNode<T>) : IBinarySearchTree<T> {

    private val logger = getLogger(BinarySearchTree::class.java)

    override fun search(value: T): Boolean {
        logger.info("Searching for value $value")
        return searchRecursivelyInOrder(value, rootNode)
    }

    private fun searchRecursivelyInOrder(searchValue: T, node: TreeNode<T>?): Boolean {
        logger.info("Searching for value $searchValue in node $node")
        return node != null && (searchRecursivelyInOrder(searchValue, node.left)
                        || Objects.equals(searchValue, node.value)
                        || searchRecursivelyInOrder(searchValue, node.right))
    }

    override fun add(value: T) {
        logger.info("Adding value $value")
        addRecursively(value, rootNode)
    }

    private fun addRecursively(value: T, node: TreeNode<T>) {
        if (value.compareTo(node.value) == -1) {
            if (node.left == null) {
                node.left = TreeNode(value)
            } else {
                addRecursively(value, node.left!!)
            }
        }
        if (value.compareTo(node.value) == 1) {
            if (node.right == null) {
                node.right = TreeNode(value)
            } else {
                addRecursively(value, node.right!!)
            }
        }
    }
}