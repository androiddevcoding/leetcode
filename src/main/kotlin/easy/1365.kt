package easy


fun main(args: Array<String>) {
    println(smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3)).toList().toString())
}

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val result = mutableListOf<Int>()
    nums.forEachIndexed { index, i ->
        var count = 0
        nums.forEach {
            if (it < i) {
                count++
            }
        }
        result.add(count)
        count = 0

    }
    return result.toIntArray()
}