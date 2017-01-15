// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int result = (Y-X)/D;
        
        //casting to long to prevent from overflowing when confronted with large numbers
        return (long)(((long)result * (long)D) + (long)X) >= (long)Y? result: result +1;
    }
}
