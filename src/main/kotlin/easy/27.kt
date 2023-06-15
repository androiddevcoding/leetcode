package easy


fun main(args: Array<String>) {
    println(removeElement(intArrayOf(3, 2, 2, 3), 3))
}


fun removeElement(nums: IntArray, k: Int): Int {
    var j = 0
    nums.forEachIndexed { index, value ->
        if (value != k) {
            nums[j] = nums[index]
            j++
        }
    }
    return j
}