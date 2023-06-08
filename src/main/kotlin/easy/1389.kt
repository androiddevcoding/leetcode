package easy

/**
Link: https://leetcode.com/problems/create-target-array-in-the-given-order/
 **/
fun main(args: Array<String>) {
    println(searchInsert(intArrayOf(1, 3, 5, 6), 6))
    //println(searchInsert(intArrayOf(1, 3, 5, 6), 2))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) return 0
    var left = 0
    var right = nums.count()
    var middle = 0
    while (left <= right) {
        middle = left + (right - 1) / 2
        if (nums[middle] == target) return middle
        else if (nums[middle] > target) right = middle - 1
        else left = middle + 1
    }
    return 0
}