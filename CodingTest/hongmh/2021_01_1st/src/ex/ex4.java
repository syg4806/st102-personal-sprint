package ex;

//문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12954
/*
 * 매개변수로 int x는 통과 되지않고 long x로 선언하니 통과 되었다...많은 시간을 들여서 생각해봤는데 조금 허무하다...ㅠ
 */

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i = 1; i <= n; i++)
        	answer[i-1] = x*i;
        
        return answer;
    }
}

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
