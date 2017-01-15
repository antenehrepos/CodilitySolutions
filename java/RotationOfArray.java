// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        int []B = new int[K];
        
        for(int i=K; i>0; i--){
            B[i-1] = A[A.length -1 -(K-i)];
        }
        
        for(int i = A.length -1; i>=K; i--){
            
            A[i] = A[i -K];
        }
        
        for(int i=0; i<B.length; i++){
            A[i] = B[i];
        }
        
        return A;
    }
}
