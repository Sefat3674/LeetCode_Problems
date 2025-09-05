class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        var a1=x
        var b1=y
        var count=0
        while(a1>0 || b1>0){
            val a= a1 % 2
            val b= b1 % 2
            if(a xor b==1){
                count++
            }
            a1=a1/2
            b1=b1/2
        }
        return count
    }
}
