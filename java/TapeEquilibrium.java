// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        long right = 0;
        long left = 0;
        
        int result = -1;
        
        for(int i:A){
            
            right += i;
        }
        
        for(int p=1; p<A.length; p++){
            
            left += A[p-1];
            right -= A[p-1];
            
            result = result < 0 || result > (int)Math.abs(left - right)?(int)Math.abs(left - right): result;
        }
        
        return result;            
    }
}
