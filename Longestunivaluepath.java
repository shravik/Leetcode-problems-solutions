/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


import java.util.*;
import java.io.*;


class Longestunivaluepath{
  
  public int longestUnivaluePath(TreeNode root) {
    
     if(root == null) return 0;
     
     int sub = Math.max(longestUnivaluePath(root.left),longestUnivaluePath(root.right));
     
     return Math.max(sub,helper(root.left,root.val)+helper(root.right,root.val));
  
  }
  
  public int helper(TreeNode root, int val){
     if(root == null || root.val != val) return 0; 
     
     return Math.max(helper(root.left,root.val),helper(root.right.root.val)) + 1;
     
  } 

}
