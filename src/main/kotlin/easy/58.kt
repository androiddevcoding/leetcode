package easy


fun main(args: Array<String>) {
    println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("   fly me   to   the moon  "))
    println(lengthOfLastWord("uffy is still joyboy"))
}

fun lengthOfLastWord(s: String): Int {
    return s.split(" ").filter { it.isNotEmpty() }.last().length
}