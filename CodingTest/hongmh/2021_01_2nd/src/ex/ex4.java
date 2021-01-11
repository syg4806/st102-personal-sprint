package ex;

//문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12931
/*
 * 괜찮은듯??!
 */

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer=0;
        String convert = Integer.toString(n);
        for(int i = 0; i< convert.length();i++) 
        	answer+=Integer.parseInt(convert.substring(i,i+1));
        	
        return answer;
    }
}

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
