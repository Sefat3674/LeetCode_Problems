class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        var res=0
        for(i in 1 until num/2+1){
            if(num%i==0) 
                res +=i
            if(res>num)
                return false
        }
        if(res==num) return true
        else return false;
    }
}
