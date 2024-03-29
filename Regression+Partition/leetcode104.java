class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int maxDepth = Math.max(left, right);
        return maxDepth + 1;
    }
}