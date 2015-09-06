// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        
        StringBuilder stack = new StringBuilder();
        
        for(char c: S.toCharArray()){
                        
            if(c== '(' || c== '[' || c== '{'){
                
                stack.append(c);
                
            }
            
            if(stack.length() == 0 && (c== ')' || c== '}' || c== ']')){
                return 0;
            }
            
            if(c == ')' && stack.charAt(stack.length() -1) != '('){
                return 0;
            }
            
            if(c == ']' && stack.charAt(stack.length() -1) != '['){
                return 0;
            }
            
            if(c == '}' && stack.charAt(stack.length() -1) != '{'){
                return 0;
            }
            
            if(c == ')' && stack.charAt(stack.length() -1) == '('){
               stack.deleteCharAt(stack.length() -1);
            }
            
            if(c == ']' && stack.charAt(stack.length() -1) == '['){
               stack.deleteCharAt(stack.length() -1);
            }
            
            if(c == '}' && stack.charAt(stack.length() -1) == '{'){
               stack.deleteCharAt(stack.length() -1);
            }
        }
        
        return stack.length() == 0? 1: 0;
    }
}
