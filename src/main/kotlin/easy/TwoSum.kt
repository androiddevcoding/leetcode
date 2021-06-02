package easy

/**
Link: https://leetcode.com/problems/two-sum/
 **/
fun main(args: Array<String>) {
    println(twoSum(intArrayOf(3, 2, 4), 6).joinToString())
    println(twoSum(intArrayOf(3, 3), 6).joinToString())
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).joinToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.forEachIndexed { indexI, i ->
        nums.forEachIndexed { indexJ, j ->
            if ((indexI != indexJ) && ((i + j) == target)) {
                return intArrayOf(indexI, indexJ)
            }
        }
    }
    return arrayOf<Int>().toIntArray()
}


