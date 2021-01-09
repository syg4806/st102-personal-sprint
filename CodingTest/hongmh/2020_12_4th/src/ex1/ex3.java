package ex1;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12909

class Solution {
    boolean solution(String s) {
        int result = 0;
        if(s.charAt(0) == ')')
 		   return false;

       for(int i = 0; i < s.length();i++) {
    	   if(s.charAt(i) == '(')
    		   result++;
    	   else if(s.charAt(i) == ')') {
    		   result--;
    	   }   
    	   if(result<0)
    		   return false;
       }
       if(result == 0)
    	   return true;
       else
    	   return false;

    }
}

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
