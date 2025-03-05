package org.hslu.ex_3

import org.hslu.ex_3.binary_search_tree.BinarySearchTree
import org.hslu.ex_3.binary_search_tree.TreeNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BinarySearchTreeTest {
    @Test
    fun testSearch() {
        val tree = TreeNode(12, TreeNode(8, TreeNode(6, TreeNode(2))), TreeNode(15, TreeNode(13), TreeNode(21, TreeNode(18), TreeNode(23, null, TreeNode(26)))))
        val binarySearchTree = BinarySearchTree(tree)
        assertTrue(binarySearchTree.search(23))
        assertFalse(binarySearchTree.search(90))
    }

    @Test
    fun testAdd() {
        val tree = TreeNode(12)
        val binarySearchTree = BinarySearchTree(tree)
        binarySearchTree.add(90)
        assertEquals(90, tree.right?.value)
        binarySearchTree.add(8)
        assertEquals(8, tree.left?.value)
        binarySearchTree.add(6)
        assertEquals(6, tree.left?.left?.value)
        binarySearchTree.add(2)
        assertEquals(2, tree.left?.left?.left?.value)
        binarySearchTree.add(15)
        assertEquals(15, tree.right?.left?.value)
        binarySearchTree.add(13)
        assertEquals(13, tree.right?.left?.left?.value)
    }
}