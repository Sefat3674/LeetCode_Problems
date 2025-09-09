class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
       var count=0
       for(i in flowerbed.indices){
        if(flowerbed[i]==0){
            val emptyleft=(i==0) || flowerbed[i-1]==0
            val emptyright= (i==flowerbed.size-1) || flowerbed[i+1]==0
            if(emptyleft && emptyright){
                flowerbed[i]=1;
                count++;
                if(count>=n) return true
            }

        }
        
       }
       return count>=n
    }
}
