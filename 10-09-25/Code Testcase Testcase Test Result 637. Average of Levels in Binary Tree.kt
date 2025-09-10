/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        if (root == null) return doubleArrayOf()

        val result = mutableListOf<Double>()
        val queue: ArrayDeque<TreeNode> = ArrayDeque()
        queue.add(root)

        while (queue.isNotEmpty()) {
            val size = queue.size
            var sum = 0.0  

            repeat(size) {
                val node = queue.removeFirst()
                sum += node.`val`
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }

            result.add(sum / size) 
        }

        return result.toDoubleArray()  
    }
}
