class Solution {
    fun findComplement(num: Int): Int {
        var ans=0
        var i=0
        var u=num
        while(u>0){
            
            val rem= u%2
            val x= rem xor 1
            ans += x * (2.0.pow(i).toInt())
            u = u/2
            i++
            
        }
        return ans
    }
}
