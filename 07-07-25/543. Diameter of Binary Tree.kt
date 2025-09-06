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
    private var ans=0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        heightd(root)
        return ans
    }
private fun heightd(root: TreeNode?):Int {
    
    if(root==null) return 0
    var lefth=heightd(root.left)
    var righth=heightd(root.right)

     ans=maxOf(ans,lefth+righth)
    return maxOf(lefth,righth)+1

}
}
