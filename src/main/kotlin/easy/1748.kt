package easy

fun main(args: Array<String>) {
    println(numberOfPairs(intArrayOf(1, 1, 1, 1, 1, 3, 3, 3, 2, 1, 3, 2, 2)).toList().toString())
}

fun numberOfPairs(nums: IntArray): IntArray {
    val numsSet = hashSetOf<Int>()

    var count = 0
    nums.forEach {
        if (numsSet.add(it).not()) {
            numsSet.remove(it)
            count++
        }
    }
    return intArrayOf(count, numsSet.size)
}

