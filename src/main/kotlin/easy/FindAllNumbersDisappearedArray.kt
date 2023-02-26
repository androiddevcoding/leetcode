package easy

/**
Link: https://leetcode.com/problems/missing-number/
 **/
fun main(args: Array<String>) {
    println(findDisappearedNumbers(intArrayOf(4,3,2,7,8,2,3,1)))
    println(findDisappearedNumbers(intArrayOf(1,1)))
    println(findDisappearedNumbers(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
}

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    var i = 0
    while(i < nums.size + 1){
        val pos = nums[i] - 1
        if(nums[i] != nums[pos]) {
            val value  = nums[i]
            nums[i] = nums[pos]
            nums[pos] = value
        } else i+=1
    }
    print(nums)
    return emptyList()
}