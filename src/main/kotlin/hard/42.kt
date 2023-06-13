package hard

import kotlin.math.min


fun main(args: Array<String>) {
    println(trap(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    println(trap(intArrayOf(1, 1)))
}


fun trap(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var maxa = 0

    while (left < right) {
        maxa = Math.max(maxa, Math.min(height[left], height[right]) * (right - left))
        if (height[left] > height[right]) {
            right--
        } else {
            left++
        }
    }
    return maxa
}