package easy


fun main(args: Array<String>) {
    println(rotate(nums = intArrayOf(1, 2, 3, 4, 5, 6, 7), k = 3))
    //  println(rotate(nums = intArrayOf(1), k = 1))
    //  println(rotate(nums = intArrayOf(-1,-100,3,99), k = 2))
    //   println(rotate(nums = intArrayOf(-1,-100), k = 2))
    // print(rotate(nums = intArrayOf(-1, -100), k = 3))
}

fun rotate(nums: IntArray, k: Int): Unit {
    for (i in 0 until k) {
        print(" $i")
    }
    println()
    fun rigth() {
        val temp = nums[nums.size - 1]
        println("temp: $temp")
        (nums.size - 2 downTo 0).forEach {
            println("index: $it")
            nums[it + 1] = nums[it]
        }
        nums[0] = temp
        print(nums.toMutableList().toString())
    }
    for (i in 0 until k) {
        rigth()
    }

}