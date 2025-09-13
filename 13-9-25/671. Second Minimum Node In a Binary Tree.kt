class Solution {
    fun findSecondMinimumValue(root: TreeNode?): Int {
        val ans = mutableListOf<Int>()   // list to store values
        inorder(root, ans)

        val sorted = ans.distinct().sorted()  // remove duplicates + sort
        return if (sorted.size < 2) -1 else sorted[1]
    }

    private fun inorder(node: TreeNode?, ans: MutableList<Int>) {
        if (node == null) return
        inorder(node.left, ans)
        ans.add(node.`val`)
        inorder(node.right, ans)
    }
}
