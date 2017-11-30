import java.util.*;
import java.io.*;

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 *       1 -> NULL
 *      /  \
 *     2 -> 3 -> NULL
 *    / \  / \
 *   4->5->6->7 -> NULL
 *
 *  Tree should like above after function call 
 */


public class PopulateNextRightpointer{
     
     public void connect(TreeLinkNode root){
          
           if(root == null)
               return;
               
           if(root.left != null){
               root.left.next = root.right;
               if(root.next != null)
                root.right.next = root.next.left; 
           }
           
           connect(root.left);
           connect(root.right);
       
     }

}
