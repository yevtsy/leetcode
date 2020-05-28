package com.leetcode.yevtsy.top100.easy

import com.leetcode.yevtsy.top100.easy.MergeTwoSortedLists.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MergeTwoSortedListsTest {
    val instance: MergeTwoSortedLists = MergeTwoSortedLists()

    @Test
    internal fun mergeTwoListsTest() {
//        left node
        val leftNode3 = ListNode(4)

        val leftNode2 = ListNode(2)
        leftNode2.next = leftNode3

        val leftNode = ListNode(1)
        leftNode.next = leftNode2

//      right node
        val rightNode3 = ListNode(4)

        val rightNode2 = ListNode(3)
        rightNode2.next = rightNode3

        val rightNode = ListNode(1)
        rightNode.next = rightNode2

//        then
        var mergeTwoLists = instance.mergeTwoLists(leftNode, rightNode)

        val result = mutableListOf<Int>()
        while (mergeTwoLists != null) {
            result.add(mergeTwoLists.`val`)
            mergeTwoLists = mergeTwoLists.next
        }

        assertEquals(mutableListOf(1, 1, 2, 3, 4, 4), result)
    }

}