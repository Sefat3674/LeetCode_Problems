class Solution {
    fun maximumProduct(nums: IntArray): Int {
        nums.sort()
        val option1=nums[nums.size-1]*nums[nums.size-2]*nums[nums.size-3]
        val option2 = nums[0] * nums[1] * nums[nums.size - 1]
        return maxOf(option1,option2)
    }
}
