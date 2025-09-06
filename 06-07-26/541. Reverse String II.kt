class Solution {
    fun reverseStr(s: String, k: Int): String {
        val chars=s.toCharArray()
        var i=0
       while (i < chars.size) {
            val end = minOf(i + k - 1, chars.size - 1)
            reverse(chars, i, end)
            i += 2 * k
        }
        return String(chars)
    }
private fun reverse(chars: CharArray,left:Int,right:Int){
        var l=left
        var r=right

        while(l<r){
            val temp=chars[l]
            chars[l]=chars[r]
            chars[r]=temp
            l++
            r--
        }
    }
}
