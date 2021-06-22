package easy

import java.util.*

/**
Link: https://leetcode.com/problems/valid-parentheses/
 **/
fun main(args: Array<String>) {
    println(isValid("()[]{}")) // true
    println(isValid("()")) // true
    println(isValid("(]")) // false
    println(isValid("([)]")) // false
}

fun isValid(s: String): Boolean {
    val leftSymbols = Stack<Char>()
    s.forEach { char ->
        if (char == '(' || char == '{' || char == '[') {
            leftSymbols.push(char)
        } else {
            if (leftSymbols.empty()) return false
            if (char == ')' && leftSymbols.peek() != '(') return false
            if (char == ']' && leftSymbols.peek() != '[') return false
            if (char == '}' && leftSymbols.peek() != '{') return false
            leftSymbols.pop()
        }
    }
    return leftSymbols.empty()
}