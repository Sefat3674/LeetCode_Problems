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
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        
        return marge(root1,root2)
        
    }
private fun marge(root1: TreeNode?, root2: TreeNode?): TreeNode?{
    
    if(root1 ==null)  return root2
    if(root2==null )  return root1
    
    val  ans= TreeNode(root1.`val`+root2.`val`)
    
    ans.left=marge(root1.left,root2.left)
    ans.right=marge(root1.right,root2.right)
    return ans



}
}
