class Solution {
    fun constructRectangle(area: Int): IntArray {
        var w = kotlin.math.sqrt(area.toDouble()).toInt()  
        while (area % w != 0) {                            
            w -= 1
        }
        return intArrayOf(area / w, w)                   
    }
}
