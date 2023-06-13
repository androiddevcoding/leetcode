package medium

import java.util.*

fun main(args: Array<String>) {
    println(findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2))
}


fun findKthLargest(nums: IntArray, k: Int): Int {
    val treeSet = PriorityQueue<Int>()
    for (value in nums) {
        treeSet.offer(value)
        println("value: $value")
        if (treeSet.size > k) {
            print("treeSet.size: " + treeSet.size + " k:" + k + "  ")
            print(treeSet.toString())

            treeSet.poll()
            println()
        }
    }
    println()
    println()
    println(treeSet.toString())
    return treeSet.peek()
}