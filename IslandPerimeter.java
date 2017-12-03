import java.util.*;
import java.io.*;


class IslandPerimeter{

    public int islandPerimeter(int[][] grid) {
    
     int count = 0, neighbors = 0;
     
      for(int i =0;i<grid.length;i++){
        for(int j 0;j<grid[i].length;j++){
             if( grid[i][j] == 1) {
              if(i<grid.length-1 &&  grid[i+1][j] == 1) neighbors++;
              if(j<grid[i].length - 1 && grid[i][j+1] == 1) neighbors++;
             
             }
           }
        }
    
        return count*4 - neighbors*2; 
    
    }


}
