class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        val rows=grid.size
        val coll=grid[0].size
        var per=0


        for(i in 0 until rows){
            for(j in 0 until coll){
                if(grid[i][j]==1){
                    per +=4;
                    if(i>0 && grid[i-1][j]==1){
                        per -=2;
                    }
                    if(j>0 && grid[i][j-1]==1){
                        per -=2;
                    }
                }

            }
        }
        return per;
    }
}
