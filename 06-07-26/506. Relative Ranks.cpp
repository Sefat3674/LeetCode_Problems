class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        int n=score.size();
        vector<int>scoreCpy=score;

        unordered_map<int,int>scoreIndx;
        for(int i=0;i<n;i++){
            scoreIndx[scoreCpy[i]]=i;
        }
        sort(scoreCpy.begin(),scoreCpy.end(),greater<int>());

        vector<string>rank(n);
        
            for(int i=0;i<n;i++){
                if(i==0){
                    rank[scoreIndx[scoreCpy[i]]]="Gold Medal";
                }
                else if(i==1){
                    rank[scoreIndx[scoreCpy[i]]]="Silver Medal";
                }
                else if(i==2){
                    rank[scoreIndx[scoreCpy[i]]]="Bronze Medal";
                }
                else{
                    rank[scoreIndx[scoreCpy[i]]] = to_string(i + 1);
                }
            }

        return rank;


    }
};
