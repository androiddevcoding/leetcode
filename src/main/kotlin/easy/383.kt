package easy

fun main(args: Array<String>) {
    println(canConstruct("aa", "aab"))
}

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val a = ransomNote.toCharArray()
    val b = magazine.toCharArray().toMutableList()
    a.forEach {
        if (b.remove(it).not()) {
            return false
        }
    }
    return true
}
