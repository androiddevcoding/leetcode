package easy

/***
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 *
Link: https://leetcode.com/problems/number-of-good-pairs/
 **/
fun main(args: Array<String>) {
    println(numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3)))
    println(numIdenticalPairs(intArrayOf(1, 1, 1, 1)))
    println(numIdenticalPairs(intArrayOf(1, 2, 3)))

}

fun numIdenticalPairs(nums: IntArray): Int {
    var count = 0
    nums.forEachIndexed { indexI, i ->
        nums.forEachIndexed { indexJ, i ->
            if (nums[indexI] == nums[indexJ] && indexI < indexJ) count++
        }
    }
    return count
}
