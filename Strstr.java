import java.util.*;
import java.io.*; 



class Strstr {
    public int strStr(String haystack, String needle) {
         if(needle == "")
             return 0;
         else {
             return haystack.indexOf(needle); 
         }
    }
}


