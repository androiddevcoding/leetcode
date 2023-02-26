package easy

/**
Link: https://leetcode.com/problems/missing-number/
 **/
fun main(args: Array<String>) {
    println(missingNumber(intArrayOf(3, 0, 1)))
    println(missingNumber(intArrayOf(0, 1)))
    println(missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
}

fun missingNumber(nums: IntArray): Int {
    val n = nums.count()
    return n * (n + 1) / 2 - nums.sum()
}