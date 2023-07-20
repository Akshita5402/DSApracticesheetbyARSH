
class Solution {
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        else{
            height(root);
            return ans;
        }
    }
    public int height(TreeNode root){
        if(root==null)return -1;
        int L=height(root.left);
        int R=height(root.right);
        ans=Math.max(ans,L+R+2);
        return 1+Math.max(L,R);
    }



}
