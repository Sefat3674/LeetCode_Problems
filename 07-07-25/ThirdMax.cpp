class Solution {
public:
    int thirdMax(vector<int>& nums) {
        if(nums.size()==1) return nums[0];
        if(nums.size()==2) return max(nums[0],nums[1]);
        long max1=LONG_MIN,max2=LONG_MIN,max3=LONG_MIN;

        for(int val: nums){
            if(val==max1 || val==max2 || val==max3) continue;
            if(val>max1){
                max3=max2;
                max2=max1;
                max1=val;
            }
            else if(val>max2){
                max3=max2;
                max2=val;
            }
            else if(val>max3)
                max3=val;
            
        }
        return (max3 == LONG_MIN) ? (int)max1 : (int)max3;




        
    }
};
