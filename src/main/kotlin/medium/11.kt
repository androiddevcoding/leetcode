package medium

fun main(args: Array<String>) {
    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    println(maxArea(intArrayOf(1, 1)))
}


fun maxArea(height: IntArray): Int {
    var maxarea = 0
    for (i in 0 until height.count()) {
        for (j in 1 until height.count()) {
            maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i))
        }
    }
    return maxarea
}