import java.util.*;
import java.io.*;


class PlusOne {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length -1;
        
        for(int i = digits.length -1; i>=0;i--){
             if(digits[i] != 9){
                 digits[i]++;
                  break;       
             }
             else {
                 digits[i] = 0;
             }
            
        }
     
        
         if(digits[0] == 0){
             int output[] = new int[digits.length + 1];
              output[0] = 1;
              return output;
         }
         
         return digits; 
        
    }
}
