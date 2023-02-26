package easy


/**
Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 **/
fun main(args: Array<String>) {
    println(findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
    println(findDisappearedNumbers(intArrayOf(1, 1)))
}

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    var i = 0
    while (i < nums.size) {
        val pos = nums[i] - 1
        if (nums[i] != nums[pos]) {
            val value = nums[i]
            nums[i] = nums[pos]
            nums[pos] = value
        } else i += 1
    }
    //print(nums.contentToString())
    val miss = mutableListOf<Int>()
    for (i in 0..nums.size - 1) {
        if (nums[i] != i + 1) {
            miss.add(i + 1)
        }
    }

    return miss
}