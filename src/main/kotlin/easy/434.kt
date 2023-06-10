package easy

fun main(args: Array<String>) {
    println(countSegments(""))
    println(countSegments("Hello, my name is John"))
}

fun countSegments(s: String): Int {
    var count = 0
    for (value in s.indices) {
        if((value == 0 || s[value - 1] == ' ') && s[value] != ' '){
            count++
        }
    }
    return  count
}