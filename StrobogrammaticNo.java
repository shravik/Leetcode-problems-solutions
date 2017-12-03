import java.util.*;
import java.io.*;


class StrobogrammaticNo{

      public boolean isStrobogrammatic(String num) {
      
         HashMap<Character,Character> hm = new HashMap<Character,Character>();
         
         hm.put('0','0');
         hm.put('1','1');
         hm.put('6','9');
         hm.put('9','6');
         hm.put('8','8');
         
         
         int l = 0, r = num.length() -1;
         
         while(l<=r){
            
            if(!hm.containsKey(num.charAt(l))) return false;
            
            if(hm.get(num.charAt(l)) != num.charAt(r)) return false; 
   
         }
         
         return true; 
      }



}
