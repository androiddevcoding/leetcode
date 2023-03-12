package easy

import kotlin.math.max

/**
Link: https://leetcode.com/problems/range-sum-query-immutable/
 **/
fun main(args: Array<String>) {
    val numArray =  NumArray(intArrayOf(-2, 0, 3, -5, 2, -1));
    print(numArray.sumRange(0, 2)) // return (-2) + 0 + 3 = 1
    print(numArray.sumRange(2, 5)) // return 3 + (-5) + 2 + (-1) = -1
    print(numArray.sumRange(0, 5)) // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
}

class NumArray(nums: IntArray) {
    private var sums = mutableListOf<Int>()
    init {
        var currentSum = 0
        nums.forEach {
            currentSum += it
            sums.add(currentSum)
        }
    }
    fun sumRange(left: Int, right: Int): Int {
        if(left == 0) return sums[right]
        return sums[right] - sums[left - 1]
    }

}