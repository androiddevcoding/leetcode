package easy

/**
Link: https://leetcode.com/problems/build-array-from-permutation/
 **/
fun main(args: Array<String>) {

    class Solution {
        val list = mutableListOf<Int>()
        fun buildArray(nums: IntArray): IntArray {
            if (nums.size == 1) return intArrayOf(nums.get(0))
            nums.forEachIndexed { index, value ->
                list.add(nums[value])
            }
            return list.toIntArray()
        }
    }

    println(Solution().buildArray(intArrayOf(0, 2, 1, 5, 3, 4)))
    println(Solution().buildArray(intArrayOf(5, 0, 1, 2, 3, 4)))
    println(Solution().buildArray(intArrayOf(1)))
}