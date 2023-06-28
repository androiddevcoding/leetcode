package easy


fun main(args: Array<String>) {
    println(strStr(haystack = "sadbutsad", needle = "sad"))
}

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}