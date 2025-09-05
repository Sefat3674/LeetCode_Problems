class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        val doubled=s+s
        val newStr=doubled.substring(1,doubled.length-1)
        return newStr.contains(s)

    }
}
