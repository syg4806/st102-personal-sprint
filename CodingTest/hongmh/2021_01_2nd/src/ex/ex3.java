package ex;

//문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12930#

/*
 * 하,,,,소문자로만 이루어져있는 단어의 경우만 생각을 해서 20분을 허비했다,,,,ㅠ
 */

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int checkBlanck = 0;
        int end = 0;
        for(int start = 0; start < s.length(); start++) {
        	end = start+1;
        	if((checkBlanck++)%2 == 0)
        		answer+=s.substring(start,end).toUpperCase();
        	else
        		answer+=s.substring(start,end).toLowerCase();
        	
        	if(s.substring(start,end).isBlank())
        		checkBlanck = 0;
        }
        	
        
        
        return answer;
    }
}

public class ex3 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.solution("try answer");
	}

}
