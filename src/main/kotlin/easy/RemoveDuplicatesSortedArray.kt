package easy

/**
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 **/
fun main(args: Array<String>) {
    class Solution {
        fun removeDuplicates(nums: IntArray): Int {
            if (nums.isEmpty()) return 0
            var i = 0
            for (j in 1 until nums.count()) {
                if (nums[i] != nums[j]) {
                    i++
                    nums[i] = nums[j]
                }
            }
            return i + 1
        }
    }

    println(Solution().removeDuplicates(intArrayOf(1, 1, 2)))
    println(Solution().removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
}

