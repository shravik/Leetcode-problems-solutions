import java.io.*;
import java.util.*;


class Palindromepermutation{

        public boolean canPermutePalindrome(String s) {
               
               int[] charcounts = new int[128];
               int count = 0; 
               
               for(int i =0;i<s.length();i++){
                  charcounts[s.charAt(i)]++;
            
               }

              for(int i =0;i<charcounts.length -1;i++){
                  count += charcounts[i]%2;
              
              }
         
         
           return count<=1; 
         
         }

}
