// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//solution based on: http://www.ardendertat.com/2011/12/13/programming-interview-questions-22-find-odd-occurring-element/

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        
        for(int item: A){
            
            result = result ^ item;
        }
        
        return result;
    }
}
