import java.io.*;
import java.util.*;

class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
     
        // converting string to character array
        char ch[] = s.toCharArray();
        
        //creating a lookup table to get the frequency of every character
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        
        for(int i =0;i<ch.length;++i){
            if(hm.containsKey(ch[i])){
                hm.put(ch[i], hm.get(ch[i]) + 1);
            }
            else
                hm.put(ch[i], 1); 
               
        }
        // checks if first unique character is present 
        for(int i =0;i<ch.length;i++){
            if(hm.get(ch[i]) == 1)
                return i; 
        }
        
       //if not found
        
        return -1;
        
    }
}
