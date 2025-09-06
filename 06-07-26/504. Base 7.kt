class Solution {
    fun convertToBase7(num: Int): String {
        if(num==0) return "0"
        var x=Math.abs(num)
        var s=""
        while(x>0){
            val rem=x%7
            s=rem.toString()+s
            x=x/7

        }
        return if(num<0) "-$s" else s
    }
}
