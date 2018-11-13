import java.util.*;
import java.io.*; 

// calculating square root of a number using Binary Search 

class SquareRoot{

 public int mySqrt(int x) {
        
        if(x <= 1) return x;
        
        int low = 1; int high = x;
        
        while(low < high){
            
            int mid = low +(high - low + 1)/2;
            
            if(mid <= x/mid){
                low = mid;
            }
            else{
                high = mid - 1;
            }
        }
        
        return low; 
    }

}
