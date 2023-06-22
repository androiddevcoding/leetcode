package easy

fun main(args: Array<String>) {
    println(sumOfUnique(intArrayOf(1, 1, 1, 1, 1, 2, 3, 4, 5)))
}

fun sumOfUnique(nums: IntArray): Int {
    var result = 0
    val intArray = IntArray(101)
    nums.forEach { num ->
        intArray[num] += 1
        if (intArray[num] == 1) result += num
        if (intArray[num] == 2) result -= num
    }
    return result
}


