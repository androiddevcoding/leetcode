package medium

fun main(args: Array<String>) {
    println(topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2).toList().toString())
}

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val frequencyMaps = nums.toList().groupingBy { it }.eachCount()
    val setOfNumber = nums.toSet()
    val sortedElem = setOfNumber.sortedByDescending { frequencyMaps[it] }
    return sortedElem.take(k).toIntArray()
}