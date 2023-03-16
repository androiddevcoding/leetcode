package easy

/**
Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 **/


fun main(args: Array<String>) {
    class Solution {
        fun finalValueAfterOperations(operations: Array<String>): Int {
            var x = 0
            for (operation in operations) {
                when (operation) {
                    "++X", "X++" -> x++
                    "--X", "X--" -> x--
                }
            }
            return x
        }
    }


    println(Solution().finalValueAfterOperations(arrayOf("--X", "X++", "X++")))
}

