package easy


fun main(args: Array<String>) {
    println(removeDuplicates(intArrayOf(1, 2, 3)))
}

fun removeDuplicates(nums: IntArray): Int {
    val n = nums.size
    if (n <= 2) return n
    var length = 2
    for (i in 2 until n) {
        if (nums[i] != nums[length - 2]) {
            nums[length] = nums[i]
            length++
        }
    }
    return length
}