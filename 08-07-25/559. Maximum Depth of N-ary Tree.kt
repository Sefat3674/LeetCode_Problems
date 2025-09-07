/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun maxDepth(root: Node?): Int {
        if(root==null) return 0
         var maxD=0
         val stack=ArrayDeque<Pair<Node, Int>>()

        stack.add(Pair(root,1))

        while(stack.isNotEmpty()){
            val (node,depth)=stack.removeLast()
            maxD=maxOf(maxD,depth)
            for(child in node.children){
                if(child !=null)
                    stack.add(Pair(child,depth+1))
            }
        }
        return maxD
    }
}
