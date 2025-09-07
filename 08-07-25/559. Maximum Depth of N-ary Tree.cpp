/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    int maxDepth(Node* root) {
        if(root==nullptr) return 0;

        int maxD=0;
        stack<pair<Node*, int>>st;

        st.push({root,1});
        while( !st.empty()){
            auto[node,depth]=st.top();
            st.pop();

            maxD=max(maxD,depth);

            for(auto child: node->children){
                if(child){
                    st.push({child,depth+1});
                }
            }
        }
        return maxD;
    }
};
