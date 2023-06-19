package easy


fun main(args: Array<String>) {
    println(numJewelsInStones("aA", "aAAbbbb"))
}


fun numJewelsInStones(jewels: String, stones: String): Int {
    val mapList = jewels.toSet()
    var count = 0
    stones.forEachIndexed { index, c ->
        if(mapList.contains(c)){
            count++
        }
    }
    return count
}