// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;
        
        for(int i:A){
            max = max <i? i: max;
        }
        
        if(max != A.length){
            
            return 0;
        }
        
        int B[] = new int[max];
        
        for(int i:A){
            
            B[i-1] = B[i-1] + 1;
        }
        
        for(int i: B){
            
            if(i != 1){
                
                return 0;
            }
        }
        
        return 1;
    }
}
