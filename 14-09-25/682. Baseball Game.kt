class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack=mutableListOf<Int>()

        for(op in operations){
            when(op){
                "+"->{
                    val size=stack.size
                    stack.add(stack[size-1]+stack[size-2])
                }
                "D"->{
                    stack.add(2*stack.last())
                }
                "C"->{
                    stack.removeAt(stack.lastIndex)
                }
                else->{
                    stack.add(op.toInt())
                }
            }
        }
        return stack.sum()

    }
}
