package com.leetcode.yevtsy.top100.easy

class MaxSubarray {
    fun maxSubArray(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }

        var maxVal = nums.max()!!

        for (outerIndex in nums.indices) {
            var aux = nums[outerIndex]
            var innerIndex = outerIndex + 1
            while (innerIndex < nums.size) {
                aux += nums[innerIndex]

                if (aux > maxVal) {
                    maxVal = aux
                }

                innerIndex++
            }
        }

        return maxVal
    }
}