/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int getMinimumDifference(TreeNode* root) {
        vector<int>res;
        inorder(root,res);
        int ans=res[1]-res[0];
        for(int i=1;i<res.size()-1;i++){
            int x=res[i+1]-res[i];
            if(ans>x)
                ans=x;

        }
        return ans;

    }
private:
    void inorder(TreeNode* root,vector<int> &v){
        if(root == nullptr) return ;
        inorder(root->left,v);
        v.push_back(root->val);
        inorder(root->right,v);
    }
};
