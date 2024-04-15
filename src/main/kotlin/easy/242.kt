package easy


fun main(args: Array<String>) {


    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val countMap = mutableMapOf<Char, Int>()

        for (value in s){
            countMap[value] = (countMap[value] ?:  0) + 1
        }

        for (value in t){
            countMap[value] = (countMap[value] ?: 0) - 1
            if (countMap.getOrDefault(value, 0) < 0) return false
        }

        return true
    }

    println(isAnagram(s = "anagram", t = "nagaram"))
    println(isAnagram(s = "rat", t = "car"))
    println(isAnagram(s = "ratsdsd", t = "car"))
}

