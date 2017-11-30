import java.util.*;
import java.io.*;


class CountPrimes{

    // using Sieve Eratosthenes algo

    public int countPrimes(int n){
     
     int count = 0;
     
     boolean[] isnotPrime = new boolean[n];
     
     if(n < 3)
      return 0;
      
      for(int i = 2;i*i<n;i++){
        for(int j = 2;i*j<n;j++){
               isnotPrime[i*j] = true; 
        }
    }

    for(int i = 2;i<n;i++){
          if(isnotPrime[i] == false)
             count++;
        }
        
        return count; 
             
  }

}
