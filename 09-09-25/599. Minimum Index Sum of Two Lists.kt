class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val ans = mutableListOf<String>()
        var minSum=Int.MAX_VALUE

        for(i in list1.indices ){
            for(j in list2.indices){
                if(list1[i]==list2[j]){
                    val sum=i+j
                    when{
                        sum<minSum->{
                            ans.clear()
                            ans.add(list1[i])
                            minSum=sum
                        }
                        sum==minSum->{
                            ans.add(list1[i])
                        }
                    }

                    
                }
            }
        }
        return ans.toTypedArray()
    }
}
