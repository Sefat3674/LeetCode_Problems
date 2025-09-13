class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var count = 1
        var maxLen = 1

        for (i in 0 until nums.size - 1) {
            if (nums[i] < nums[i + 1]) {
                count++
                maxLen = maxOf(maxLen, count)
            } else {
                count = 1
            }
        }

        return maxLen
    }
}
