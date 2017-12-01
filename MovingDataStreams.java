import java.util.*;
import java.io.*;


class MovingDataStreams{

    Queue<Integer> queue;
    int sum;
    double average;
    int n; 
    

      public MovingAverage(int size) {
         queue = new LinkedList<Integer>();
         sum = 0; 
         average = 0.0;
         n = size;
        
    }
    
    public double next(int val) {
        queue.offer(val);
        sum = sum + val;
        if(queue.size()<=n){
            average = (double) sum/queue.size();
            }
            
       else {
          int remove = queue.poll();
          sum = sum - remove; 
          average = (double) sum/n;
          }
        
        return average; 
        
    }



}
