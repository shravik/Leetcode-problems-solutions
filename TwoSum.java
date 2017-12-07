import java.io.*;
import java.util.*;


class TwoSum{

   public int[] twoSum(int[] nums, int target){
      
       int output[] = new int[2];
       
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
       
       for(int i =0;i<nums.length;i++){
         if(hm.containsKey(target - nums[i]){
               int index = hm.get(target-nums[i]);
               output[0] = Math.min(i,index);
               output[1] = Math.max(i,index);
         }
        else
            hm.put(nums[i],i); 
       
       } 
      
       return output; 
   
   } 




}

