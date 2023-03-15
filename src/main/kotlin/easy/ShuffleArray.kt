package easy

/**
Link: https://leetcode.com/problems/shuffle-the-array/
 **/

fun main(args: Array<String>) {
    class Solution {
        fun shuffle(nums: IntArray, n: Int): IntArray {
            val list = mutableListOf<Int>()

            for (i in 0 until n) {
                list.add(nums[i])
                list.add(nums[i + n])
            }
            return list.toIntArray()
        }
    }


    println(Solution().shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3).toMutableList())
}
