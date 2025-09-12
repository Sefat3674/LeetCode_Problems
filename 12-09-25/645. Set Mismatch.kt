class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        val freq = mutableMapOf<Int, Int>()
        
        // Count frequencies
        for (num in nums) {
            freq[num] = freq.getOrDefault(num, 0) + 1
        }

        var duplicate = -1
        var missing = -1

        // Check from 1 to n
        for (i in 1..nums.size) {
            when (freq.getOrDefault(i, 0)) {
                2 -> duplicate = i
                0 -> missing = i
            }
        }

        return intArrayOf(duplicate, missing)
    }
}
