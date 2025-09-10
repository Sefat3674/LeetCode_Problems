class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        
        var ans=0.0
        for(i in 0 until k){
            ans +=nums[i]

        }
        var maxSum=ans

        for(i in k until nums.size){
            ans +=nums[i]-nums[i-k]
            maxSum=maxOf(maxSum,ans)
        }
        return maxSum/k

       
    
        
        


    }
}
