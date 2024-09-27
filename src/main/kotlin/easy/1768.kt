package easy


fun main(args: Array<String>) {
    fun mergeAlternately(word1: String, word2: String): String {
        val maxI = word1.length + word2.length
        var resultString = ""
        for (i in 0 until maxI) {

            if (i < word1.length) {
                resultString += word1.get(i)
            }

            if (i < word2.length) {
                resultString += word2.get(i)

            }

        }
        return resultString
    }

    println(mergeAlternately(word1 = "abc", word2 = "pqr"))
    println(mergeAlternately(word1 = "ab", word2 = "pqrs"))
    println(mergeAlternately(word1 = "abcd", word2 = "pq"))
}

