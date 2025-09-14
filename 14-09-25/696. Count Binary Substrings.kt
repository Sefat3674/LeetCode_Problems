class Solution {
    fun countBinarySubstrings(s: String): Int {
        var curr = 1
        var prev = 0
        var res = 0

        for (i in 1 until s.length) {
            if (s[i] == s[i - 1]) {
                curr++
            } else {
                res += minOf(curr, prev)
                prev = curr
                curr = 1
            }
        }

        return res + minOf(curr, prev)
    }
}
