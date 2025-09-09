class Solution {
    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
        var minx=m
        var miny=n

        for(op in ops){
            val (x,y)=op
            if(minx>x) minx=x
            if(miny>y) miny=y
        }
        return minx*miny
    }
}
