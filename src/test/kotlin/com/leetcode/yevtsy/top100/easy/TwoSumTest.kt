package com.leetcode.yevtsy.top100.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class TwoSumTest {

    var instance: TwoSum = TwoSum()

    val hugeArray = intArrayOf(230, 863, 916, 585, 981, 404, 316, 785, 88, 12, 70, 435, 384, 778, 887, 755, 740, 337, 86, 92, 325, 422, 815, 650, 920, 125,
            277, 336, 221, 847, 168, 23, 677, 61, 400, 136, 874, 363, 394, 199, 863, 997, 794, 587, 124, 321, 212, 957, 764, 173, 314, 422, 927, 783, 930,
            282, 306, 506, 44, 926, 691, 568, 68, 730, 933, 737, 531, 180, 414, 751, 28, 546, 60, 371, 493, 370, 527, 387, 43, 541, 13, 457, 328, 227, 652, 365,
            430, 803, 59, 858, 538, 427, 583, 368, 375, 173, 809, 896, 370, 789)

    @Test
    internal fun testBruteForceImplementation() {
        assertTrue(intArrayOf(0, 1).contentEquals(instance.twoSumBruteForce(intArrayOf(2, 7, 11, 15), 9)))

        assertTrue(intArrayOf(1, 2).contentEquals(instance.twoSumBruteForce(intArrayOf(3, 2, 4), 6)))

        assertTrue(intArrayOf(0, 1).contentEquals(instance.twoSumBruteForce(intArrayOf(3, 3), 6)))

        assertTrue(intArrayOf(28, 45).contentEquals(instance.twoSumBruteForce(hugeArray, 542)))
    }

    @Test
    internal fun testOptimizedImplementation() {
        assertTrue(intArrayOf(0, 1).contentEquals(instance.twoSumOptimized(intArrayOf(2, 7, 11, 15), 9)))

        assertTrue(intArrayOf(1, 2).contentEquals(instance.twoSumOptimized(intArrayOf(3, 2, 4), 6)))

        assertTrue(intArrayOf(0, 1).contentEquals(instance.twoSumOptimized(intArrayOf(3, 3), 6)))

        assertTrue(intArrayOf(28, 45).contentEquals(instance.twoSumOptimized(hugeArray, 542)))
    }

    @Test
    internal fun testBestImplementation() {
        assertTrue(intArrayOf(0, 1).contentEquals(instance.twoSumBest(intArrayOf(2, 7, 11, 15), 9)))

        assertTrue(intArrayOf(1, 2).contentEquals(instance.twoSumBest(intArrayOf(3, 2, 4), 6)))

        assertTrue(intArrayOf(0, 1).contentEquals(instance.twoSumBest(intArrayOf(3, 3), 6)))

        assertTrue(intArrayOf(28, 45).contentEquals(instance.twoSumBest(hugeArray, 542)))
    }
}
