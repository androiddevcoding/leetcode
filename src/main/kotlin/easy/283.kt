package easy

// 283
fun main(args: Array<String>) {
    println(moveZeroes(intArrayOf(0, 1, 0, 3, 12)))
    //println(searchInsert(intArrayOf(0), 2))
}

fun moveZeroes(nums: IntArray): Unit {
    var end = 0
    for (i in 0 until nums.count()) {
        if (nums[i] != 0) {
            val temp = nums[end]
            nums[end] = nums[i]
            nums[i] = temp
            end++
        }
    }
    println(nums.toList().toString())
}