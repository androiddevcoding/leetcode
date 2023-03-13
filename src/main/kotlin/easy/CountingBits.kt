package easy

/**
Link: https://leetcode.com/problems/counting-bits/
 **/
fun main(args: Array<String>) {
    println(countBits(2))
    println(countBits(5))
}

fun countBits(n: Int): IntArray {
    val res = IntArray(n + 1)

    for (i in 1..n) {
        res[i] = res[i and i - 1] + 1
    }

    return res
}
