package easy

/**
Link: https://leetcode.com/problems/single-number/
 **/
fun main(args: Array<String>) {
    println(singleNumber(intArrayOf(2,2,1)) )
    println(singleNumber(intArrayOf(4,1,2,1,2)))
    println(singleNumber(intArrayOf(1)))
}

fun singleNumber(nums: IntArray): Int {
    var result = 0
    for(num in nums){
        result = num.xor(result)
    }
    return result
}