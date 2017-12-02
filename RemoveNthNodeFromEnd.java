import java.util.*;
import java.io.*;



class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode first = new ListNode(0);
        
        ListNode mainptr = first, refptr = first;
        refptr.next = head;
        
        for(int i = 1;i<=n+1;i++){
            mainptr = mainptr.next;
        }
        
        
        while(mainptr!=null){
            mainptr = mainptr.next;
            refptr = refptr.next;
        }
        
        refptr.next = refptr.next.next;
        
        return first.next; 
    }
}
