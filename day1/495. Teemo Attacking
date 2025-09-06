class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var res=0
        for(i in 0 until timeSeries.size-1){
            var inx=timeSeries[i+1]-timeSeries[i]
            res +=min(inx,duration)

        }
        return res+duration
        
    }
}
