package com.leetcode.yevtsy.top100.easy

class TwoSum {

    //    Test input: [2,7,11,15], target = 9 : [0,1]
    //    Test input: [3,2,4], target = 6 : [1,2]
    //    Test input: [3,3], target = 6 : [0,1]

    //    Test input: [230,863,916,585,981,404,316,785,88,12,70,435,384,778,887,755,740,337,86,92,325,422,815,650,920,125,
    //    277,336,221,847,168,23,677,61,400,136,874,363,394,199,863,997,794,587,124,321,212,957,764,173,314,422,927,783,930,
    //    282,306,506,44,926,691,568,68,730,933,737,531,180,414,751,28,546,60,371,493,370,527,387,43,541,13,457,328,227,652,
    //    365,430,803,59,858,538,427,583,368,375,173,809,896,370,789] , target = 542 : [28,45]

    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {

        for (currentInd in nums.indices) {
            for (otherInd in nums.indices) {
                if (currentInd != otherInd && nums[currentInd] + nums[otherInd] == target) {
                    return intArrayOf(currentInd, otherInd)
                }
            }
        }

        return intArrayOf()
    }

    fun twoSumOptimized(nums: IntArray, target: Int): IntArray {

        val auxMap = hashMapOf<Int, Int>()

        for (index in nums.indices) {
            val value = target - nums[index]
            auxMap[value] = index
        }

        for (index in nums.indices) {
            val matchedIndex = auxMap.entries
                    .firstOrNull { nums[index] == it.key && index != it.value }
                    ?.value

            if (matchedIndex != null) {
                return intArrayOf(index, matchedIndex)
            }
        }

        return intArrayOf()
    }

    fun twoSumBest(nums: IntArray, target: Int): IntArray {
        val container = hashMapOf<Int, Int>()

        for (index in nums.indices) {
            val current = nums[index]
            if (container.containsKey(current)) {
                return intArrayOf(container[current]!!, index)
            }

            container[target - current] = index
        }

        return intArrayOf()
    }
}