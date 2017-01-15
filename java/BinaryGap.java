// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        
        int gap = -1;
        int prev = 0;
        
        while(binary.contains("1")){
            
            int current = binary.indexOf("1");
            gap = gap < (current - prev)? (current - prev): gap;
            binary = binary.substring(current + 1);
        }
        
        return gap;
    }
}
