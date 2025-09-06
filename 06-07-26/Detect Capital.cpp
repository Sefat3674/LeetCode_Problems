class Solution {
public:
    bool detectCapitalUse(string word) {
        int c=0;
        if(isupper(word[0])){
            for(int i=1;i<word.size();i++){
                if(isupper(word[i])) c++;
            }
            if(c==word.size()-1 || c==0) return true;
            else return false;
        }
        else{
            for(int i=1;i<word.size();i++){
                if(isupper(word[i])) return false;
            }
        }
        return true;
    
    }
};
