import java.util.*;
import java.io.*;

class NumberOfIslands {

    private void searchland(char[][] grid, int i, int j){
         
        grid[i][j] = '0';
        
        if(i>0 && grid[i-1][j] == '1') searchland(grid,i-1,j);
        if(j>0 && grid[i][j-1] == '1') searchland(grid,i,j-1);
        if(i<grid.length-1 && grid[i+1][j] == '1') searchland(grid,i+1,j);
        if(j<grid[0].length -1 && grid[i][j+1] == '1') searchland(grid,i,j+1); 
    }
    
    
    public int numIslands(char[][] grid) {
        
        if(grid.length == 0) return 0;
        
        int count = 0;
        
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                 if(grid[i][j] == '1'){
                     searchland(grid,i,j);
                      count++;
                 }
            }
        }
        
        return count; 
        
    }
    
    
    
    }
