// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// Approach find the index when all the path items are 1 (i.e when they happened exactly once, they'll be deducted from the total

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        
        int expectedTotal = (int)((long)X * ((long)(X+1)))/2;
        int path[] = new int[X];
        int earliest = -1;
        
        for(int i=0; i<A.length; i++){
            
            path[A[i] -1] = path[A[i] -1] + 1;
            expectedTotal = path[A[i] -1] == 1? expectedTotal - A[i]: expectedTotal;
            
            if(expectedTotal == 0){
                
                return i;
            }
        }
        
        return earliest;
    }
}
