package easy

/**
Link: https://leetcode.com/problems/concatenation-of-array/
 **/
fun main(args: Array<String>) {

    class Solution {
        fun getConcatenation(nums: IntArray): IntArray {
            val num2 = IntArray(nums.size * 2)
            for (i in nums.indices) {
                num2[i] = nums[i]
                num2[i + nums.size] = nums[i]
            }
            return num2
        }
    }

    println(Solution().getConcatenation(intArrayOf(1, 2, 1)).toList())
    println(Solution().getConcatenation(intArrayOf(1, 3, 2, 1)).toList())
}