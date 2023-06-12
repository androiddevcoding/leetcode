package easy

import java.util.*

fun main(args: Array<String>) {
    println(thirdMax(intArrayOf(3, 2, 1)))
    println(thirdMax(intArrayOf(2, 2, 3, 1)))
    println(thirdMax(intArrayOf(1, 2)))
}

fun thirdMax(nums: IntArray): Int {
    val list = TreeSet<Int>()
    list.addAll(nums.toList())
    if (list.size < 3) {
        return list.last()
    }
    list.pollLast()
    list.pollLast()
    return list.last()
}