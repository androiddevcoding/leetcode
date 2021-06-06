package easy

/**
Link: https://leetcode.com/problems/valid-mountain-array/
 **/
fun main(args: Array<String>) {
    println(validMountainArray(intArrayOf(2, 1))) // false
    println(validMountainArray(intArrayOf(3, 5, 5))) // false
    println(validMountainArray(intArrayOf(0, 3, 2, 1))) // true
    println(validMountainArray(intArrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0))) // true
}

fun validMountainArray(arr: IntArray): Boolean {
    val n = arr.size - 1
    var i = 0
    while (i < n && arr[i] < arr[i + 1]) {
        i++
    }
    if (i == 0 || i == n) return false
    while (i < n && arr[i] > arr[i + 1]) {
        i++
    }
    return i == n
}


