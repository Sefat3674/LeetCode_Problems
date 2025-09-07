class Solution {
    fun reverseWords(s: String): String {
        val chars= s.toCharArray()
        var start=0

        for(i in chars.indices){
            if(chars[i]==' '){
                reverse(chars,start,i-1)
                start=i+1
            }
        }
        reverse(chars,start,chars.size-1)
        return String(chars)
    }
private fun reverse(char: CharArray,left: Int,Right: Int){
    var l=left
    var r=Right
    while(l<r){
        val temp=char[l]
        char[l]=char[r]
        char[r]=temp
        l++
        r--
    }

}


}
