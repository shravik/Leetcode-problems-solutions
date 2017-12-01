import java.util.*;
import java.io.*;


class RepeatedStringMatch{

public int repeatedStringMatch(String A, String B) {
        
        int count = 0;
        
        StringBuilder sb = new StringBuilder(); 
        
        while(sb.indexOf(B) < 0){
            sb.append(A);
             if(sb.length() - A.length() > B.length() && sb.indexOf(B) <0) {
                  return -1;
             }
            
            count++;
        }
        
        return count; 
    }


}
