class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val row=mat.size
        val col=mat[0].size

        if(row*col != r*c) return mat
        val result=Array(r){IntArray(c)}

        for(i in 0 until row){
            for(j in 0 until col){
                val index=i*col+j
                val newR=index/c
                val newC=index%c
                result[newR][newC]=mat[i][j]


            }

        }
        return result
    }
}
