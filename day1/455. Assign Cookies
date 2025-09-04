class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()

        var i=0
        var j=0
        var ans=0

        while(i<g.size && j<s.size){
            if(s[j]>=g[i]){
                ans++
                i++
                j++
            }
            else{
                j++
            }
        }
    
    return ans
    }
}
