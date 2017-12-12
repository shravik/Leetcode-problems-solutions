import java.io.*;
import java.util.*;


class PowerofTwo{

public boolean isPowerOfTwo(int n) {
         return n>0 && ((n&(n-1)) == 0);
    }
    
  }


