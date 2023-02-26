package easy

import java.util.*

/**
Link: https://leetcode.com/problems/contains-duplicate/
 **/
fun main(args: Array<String>) {
    println(containsDuplicate(intArrayOf(3,3,2,1)))
    println(containsDuplicate(intArrayOf(34,2,2,12)))
    println(containsDuplicate(intArrayOf(6,42,31)))
    println(containsDuplicate(intArrayOf(2,2,2,2)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()
    for (num in nums) {
        if (num in seen) {
            return true
        }
        seen.add(num)
    }
    return false
}