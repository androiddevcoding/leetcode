package easy

import kotlin.math.ceil


fun main(args: Array<String>) {
    println(majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
}

fun majorityElement(nums: IntArray): Int {
    var count = 0
    var number = nums[0]
    nums.forEach {
        if (count == 0) number = it
        if (it == number) count++
        else count--
    }
    return number
}