class Solution {
    fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
        val m = img.size
        val n = img[0].size
        val result = Array(m) { IntArray(n) }

        for (i in img.indices) {
            for (j in img[0].indices) {
                result[i][j] = smothen(img, i, j)
            }
        }
        return result
    }

    private fun smothen(img: Array<IntArray>, x: Int, y: Int): Int {
        val m = img.size
        val n = img[0].size
        var sum = 0
        var count = 0

        for (dx in -1..1) {
            for (dy in -1..1) {
                val nx = x + dx
                val ny = y + dy
                if (nx in 0 until m && ny in 0 until n) {
                    sum += img[nx][ny]
                    count++
                }
            }
        }
        return sum / count
    }
}
