class Solution {
    fun findLHS(nums: IntArray): Int {
        nums.sort()
        var p=0
        var ans=0

        for(i in nums.indices){
            while(nums[i]-nums[p]>1)
                p++;
        
            if(nums[i]-nums[p]==1){
                ans=maxOf(ans,i-p+1)
            }
        }
        return ans
    }
        
    
    
}
