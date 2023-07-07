package easy


fun main(args: Array<String>) {
    println(canJump(intArrayOf(3, 2, 1, 0, 4)))
    println(canJump(intArrayOf(0)))
    println(canJump(intArrayOf(2, 0)))
}

fun canJump(nums: IntArray): Boolean {
    var lastPos = nums.lastIndex
    for (i in nums.size - 1 downTo 0) {
        if (i + nums[i] >= lastPos) {
            lastPos = i
        }
    }
    return lastPos == 0
}