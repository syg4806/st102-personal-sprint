package ex;

import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        Stack<String> keep = new Stack<>();
        
        
        while(n > 3) {
        	if(n%3 == 0)
            	keep.push(Integer.toString(4));
            else if(n%3 == 1)
            	keep.push(Integer.toString(1));
            else if(n%3 == 2)
            	keep.push(Integer.toString(2));
        	
        	n/=3;
        }
        
        if(n == 3)
        	keep.push(Integer.toString(4));
        else if(n == 2)
        	keep.push(Integer.toString(2));
        else if(n == 1) 
        	keep.push(Integer.toString(1));
        
        while(!keep.isEmpty()) {
        	answer+=keep.peek();
        	keep.pop();
        }
        	
        	
        return answer;
    }
}
public class ex4 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(19));

	}

}
