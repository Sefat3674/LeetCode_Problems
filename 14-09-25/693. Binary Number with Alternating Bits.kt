class Solution {
    fun hasAlternatingBits(n: Int): Boolean {
        val binary = Integer.toBinaryString(n)  // convert to binary string
        for (i in 0 until binary.length - 1) {
            if (binary[i] == binary[i + 1]) {
                return false
            }
        }
        return true
    }
}
