package easy

/**
Link: https://leetcode.com/problems/longest-common-prefix/
 **/
fun main(args: Array<String>) {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight"))) // "fl"
    println(longestCommonPrefix(arrayOf("dog", "racecar", "car"))) // ""
    println(longestCommonPrefix(arrayOf("c", "acc", "ccc"))) // ""

}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var prefix = strs[0]
    strs.forEachIndexed { index, s ->
        while (s.indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}