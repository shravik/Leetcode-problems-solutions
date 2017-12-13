import java.io.*;
import java.util.*; 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 
 
class Binarytrpaths {

 public void inorder(TreeNode root, String path, List<String> list){
    
     if(root.left == null && root.right == null) list.add(path + root.val);
     if(root.left != null) inorder(root.left, path+ root.val + "->", list);
     if(root.right != null) inorder(root.right, path + root.val + "->",list); 
 
 }



 public List<String> binaryTreePaths(TreeNode root){
    
    List<String> list = new ArrayList<String>(); 
    
    if(root != null)
      inorder(root,"",list);
    
    return list; 
   
 }


}
