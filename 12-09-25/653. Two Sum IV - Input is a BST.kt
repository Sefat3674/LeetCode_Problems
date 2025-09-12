class Solution {
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        val values = mutableListOf<Int>()
        preorder(root, values)

        val seen = mutableSetOf<Int>()
        for (num in values) {
            if (k - num in seen) return true
            seen.add(num)
        }
        return false
    }

    private fun preorder(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return
        list.add(node.`val`)
        preorder(node.left, list)
        preorder(node.right, list)
    }
}
