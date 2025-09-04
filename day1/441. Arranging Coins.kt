class Solution {
    fun arrangeCoins(n: Int): Int {
        var i=1
        var sum=0L

        while(sum+i<=n){
            sum +=i
            i++
        }
        return i-1
    }
}
