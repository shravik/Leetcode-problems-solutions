import java.util.*;
import java.io.*;


class FindtheDifference{
 
     public char findTheDifference(String s, String t) {
        
     int countS = 0,countT = 0;
        
      for(int i =0;i<s.length();i++){
          countS = countS + (int)s.charAt(i);
      }  
        
      for(int j = 0;j<t.length();j++){
          countT = countT  + (int)t.charAt(j);
      }  
        
        return (char) (countT- countS);
        
    }


}
