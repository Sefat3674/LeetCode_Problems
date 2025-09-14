class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return null

        return when {
            root.`val` == `val` -> root
            `val` < root.`val` -> searchBST(root.left, `val`)
            else -> searchBST(root.right, `val`)
        }
    }
}
