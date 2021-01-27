
//문제링크 : https://programmers.co.kr/learn/courses/30/lessons/68935
/*
 *뒤집어지는 LIFO의 특징이 생각나서 stack을 이용하여 해결해봤다.
 *stack을 이용하여 푼사람은 별로 없는듯??^^
 *근데 좋은코드인지는 모르겠네ㅎㅎ;;;;
 */

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> keepNum = new Stack<>();
        int placeValue = 1;
        
        if(n<3)
        	answer=n;
        
        while(n >= 3){
        	keepNum.push(n%3);
        	n /=3;
        	if(n < 3)
        		keepNum.push(n);
        }
        
        while(!keepNum.isEmpty()) {
        	answer+=keepNum.peek()*placeValue;
        	placeValue*=3;
        	keepNum.pop();
        }

        return answer;
    }
}

public class ex4 {
	
	public static void main(String[] args) {
		
	}
}
