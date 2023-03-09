package easy

import kotlin.math.max

/**
Link: https://leetcode.com/problems/maximum-subarray/
 **/
fun main(args: Array<String>) {
    println(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(maxSubArray(intArrayOf(5, 4, -1, 7, 8)))
    println(maxSubArray(intArrayOf(1)))
}

fun maxSubArray(nums: IntArray): Int {
    var maxSum = nums[0]
    var currentSum = nums[0]
    for (i in 1 until nums.count()) {
        currentSum = max(currentSum + nums[i], nums[i])
        maxSum = max(currentSum, maxSum)
    }
    return maxSum
}