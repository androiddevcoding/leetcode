package easy


fun main(args: Array<String>) {
    println(reverseWords("the sky is blue"))
}

fun reverseWords(s: String): String {
    val list = s.split(" ").filter { it.isNotEmpty() }
    return list.asReversed().joinToString(" ")
}