package easy

import kotlin.math.max
import kotlin.math.min

/**
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 **/
fun main(args: Array<String>) {
    println(maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    println(maxProfit(intArrayOf(7, 6, 4, 3, 1)))
}

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var currentMin = prices[0]
    prices.forEach { price ->
        maxProfit = max(maxProfit, price - currentMin)
        currentMin = min(currentMin, price)
    }
    return maxProfit
}