import java.util.*;
import java.io.*;


class Flipgame{

  public List<String> generatePossibleNextMoves(String s) {
        
         List<String> list = new ArrayList<String>();
        
         char[] arr = s.toCharArray();
        
         for(int i =0;i<arr.length -1;i++){
             if(arr[i] == arr[i+1] && arr[i] == '+'){
                 arr[i] = '-';
                 arr[i+1] = '-';
                 list.add(new String(arr));
                 arr[i] = '+';
                 arr[i+1] = '+'; 
             }
         }
             
        return list; 
        
    }



}
