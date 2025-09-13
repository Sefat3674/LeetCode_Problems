class Solution {
    fun validPalindrome(s: String): Boolean {
        var left=0
        var right=s.length-1
        while(left<right){
            if(s[left] !=s[right]){
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1)
            }
            left++
            right--
        }
        return true
        
}
private fun isPalindrome(s: String,i:Int,j:Int):Boolean{
    var left=i;
    var right=j
    while(left<right){
        if(s[left] != s[right]) return false
        left++
        right--
    }
    return true
}

}
