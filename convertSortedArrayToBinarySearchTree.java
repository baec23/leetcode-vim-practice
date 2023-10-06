/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    private TreeNode helper(int[] nums, int startIndex, int endIndex) {
        if(startIndex < 0 || endIndex >= nums.length || startIndex > endIndex){
            return null;
        }
        if(startIndex == endIndex){
            return new TreeNode(nums[startIndex]);
        }
        int midPoint = (endIndex - startIndex) / 2 + 1;
        TreeNode toReturn = new TreeNode(nums[midPoint]);
        toReturn.left = helper(nums, startIndex, midPoint-1);
        toReturn.right = helper(nums, midPoint+1, endIndex);
        return toReturn;
    }
}
