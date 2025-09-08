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
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(subRoot==null) return true
        if(root==null)  return false

        if(isidentical(root,subRoot)) return true

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)     
    }
private fun isidentical(r: TreeNode?, s: TreeNode?): Boolean{
    if(r==null && s==null) return true
    if(r==null || s==null) return false

    return r.`val`==s.`val` 
    && isidentical(r.left,s.left) 
    && isidentical(r.right,s.right)
}
}
