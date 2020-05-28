package com.leetcode.yevtsy.top100.easy

class MergeTwoSortedLists {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) {
            return l2
        } else if (l2 == null) {
            return l1
        }

        val leftVal = l1.`val`
        val rightVal = l2.`val`

        return if (leftVal <= rightVal) {
            val resultNode = ListNode(leftVal)
            resultNode.next = if (l1.next != null) { mergeTwoLists(l1.next, l2) } else { l2 }
            resultNode
        } else {
            val resultNode = ListNode(rightVal)
            resultNode.next = if (l2.next != null) { mergeTwoLists(l1, l2.next) } else { l1 }
            resultNode
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}