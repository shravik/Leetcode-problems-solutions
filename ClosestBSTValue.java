import java.util.*;
import java.io.*;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 
 class ClosestBSTValue{
  
    // Recursive approach 
     
     public int closestValue(TreeNode root, double target) {
        
           int i = root.val; 
           TreeNode child = (target < i) ? root.left : root.right; 
           if(child == null) return i; 
           int j = closestValue(child,target);
           return Math.abs(i-target) < Math.abs(j-target) ? i : j; 
     
     } 
     
     
     
     // Iterative approach 
     
     public int closestValue2(TreeNode root, double target){
     
     
          TreeNode closestElement = root, node = root; 
        
        if(closestElement.val == target) return closestElement.val ;
        
        while(node != null){
            
             if( Math.abs(node.val - target) < Math.abs(target - closestElement.val)){
                  closestElement = node; 
             }
            
            if(node.val > target)
                node = node.left;
            else
                node = node.right; 
            
        } // end of while
        
        return closestElement.val; 
           
        
      
     
     
     } // end of function 
 
 
 }
 
 
 
