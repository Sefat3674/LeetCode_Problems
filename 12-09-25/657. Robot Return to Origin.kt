class Solution {
    fun judgeCircle(moves: String): Boolean {
        var x=0
        var y=0
        for(char in moves){
            if(char=='U')
                x=x+1
            else if(char=='D') x=x-1
            else if(char=='L') y=y-1
            else if(char=='R') y=y+1

        }
        return (x==0 && y==0)
    }
}
