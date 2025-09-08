class Solution {
    fun distributeCandies(candyType: IntArray): Int {
        val uniqueTypes=candyType.toSet().size
        return minOf(uniqueTypes,candyType.size/2)
    }
}
