package week_4;

public class XInterval {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] =x;
        for(int i=1; i<n;i++) {
        	answer[i]=x+answer[i-1];
        }
        return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12954
//so......easy....