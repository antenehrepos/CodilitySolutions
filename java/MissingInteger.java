// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
         int B[] = new int[A.length];
        int min = -1;
        
        for(int item: A){
            
            if(item >0 && A.length >= item){
                
                B[item -1]++;
            }
        }
        
        for(int i=0; i<B.length; i++){
            
            if(B[i] == 0 && (min < 0 || min > i)){
                
                min = i;
            }
        }
        
        return Math.abs(min)+1;
    }
}
