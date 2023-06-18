package easy

import java.lang.StringBuilder


fun main(args: Array<String>) {
    println(restoreString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)))
}

fun restoreString(s: String, indices: IntArray): String {
    val result = StringBuilder(s)
    indices.forEachIndexed { index, value ->
        result[value] = s[index]
    }
    return result.toString()
}