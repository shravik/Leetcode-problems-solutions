import java.util.*;
import java.io.*;

// num1 and num2 can be of any length (Integers as Strings) 


class AddString{

  public String addStrings(String num1, String num2){
  
        StringBuilder sub = new StringBuilder();
        
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1; 
        
        int carry = 0; 
        int sum = 0; 
        
        
        while(len1>=0 || len2>=0){
         int n1 = len1>=0 ? num1.charAt(len1) - '0' : 0;
         int n2 = len2>=0 ? num2.charAt(len2) - '0' : 0; 
         sum = n1 + n2 + carry;
         carry = sum > 9 ? 1 : 0;
         sub.insert(0,sum%10);
         len1--;
         len2--;
         
     
        } // end of while 
        
        if(carry == 1) sub.insert(0,1);
        
        return sub.toString();
  
  } 



}
