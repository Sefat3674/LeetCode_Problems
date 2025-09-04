class Solution {
    fun addStrings(num1: String, num2: String): String {
        var x=num1.length-1
        var y=num2.length-1
        var carry=0

        val result = StringBuilder()
         while(x>=0 || y>=0 || carry>0){
            val digit1= if(x>=0) num1[x]-'0' else 0
            val digit2=if(y>=0) num2[y]-'0' else 0

            val total=digit1+digit2+carry
            carry=total/10
            result.append(total%10)
            x--
            y--

         }
         return result.reverse().toString()
    }
}
