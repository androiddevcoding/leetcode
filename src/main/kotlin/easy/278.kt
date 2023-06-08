package easy

fun main(args: Array<String>) {

}

fun firstBadVersion(n: Int): Int {
    var left = 1
    var right = n
    while (left < right) {
        val middle = left + (right + left) / 2
        if (isBadVersion(middle)) {
            right = middle
        } else {
            left = middle + 1
        }
    }
    return left
}

fun isBadVersion(n: Int): Boolean {
    return false
}