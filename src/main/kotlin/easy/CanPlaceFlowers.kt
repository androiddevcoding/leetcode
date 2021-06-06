package easy

/**
Link: https://leetcode.com/problems/can-place-flowers/
 **/
fun main(args: Array<String>) {
    println(canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), n = 1)) // true
    println(canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), n = 2)) // false
    println(canPlaceFlowers(intArrayOf(1, 0, 0, 0, 0, 1), n = 2)) // false
    println(canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1, 0, 0), 2)) // true
    println(canPlaceFlowers(intArrayOf(0, 0, 1, 0, 0), 1)) // true
}

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var count = n
    val list = flowerbed.toMutableList()
    if (n == 0) return true
    list.forEachIndexed { index, value ->
        if ((list.getOrNull(index - 1) == 0 || list.getOrNull(index - 1) == null)
            && (list.getOrNull(index) == 0 && (list.getOrNull(index + 1) == 0 || list.getOrNull(index + 1) == null))
        ) {
            list[index] = 1
            count -= 1
            if (count == 0) {
                return true
            }
        }
    }
    return count == 0
}