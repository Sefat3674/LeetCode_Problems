/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun findTilt(root: TreeNode?): Int {
        val res = IntArray(1)
        postorder(root,res)
        return res[0]
    }
private fun postorder(root: TreeNode?,res: IntArray):Int{
    if(root == null) return 0

    val lf=postorder(root.left,res)
    val rf=postorder(root.right,res)

    res[0] +=kotlin.math.abs(lf-rf)

    return root.`val` + lf + rf
}
}
