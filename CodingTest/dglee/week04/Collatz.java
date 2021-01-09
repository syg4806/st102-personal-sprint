package week_4;

public class Collatz {
	public int solution(long num) {
		int answer = 0;
        
        while(num!=1) {
        	answer+=1;
        	if(num%2==0) {
        		num/=2;
        	}
        	else {
        		num = num*3+1;
        	}
        	
        	if(answer==500)
        		return -1;
        }
        return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12943
//윤권이한테 질문했던거였는데, 코드 자체에는 문제가 없었고, 매개변수의 자료형이 문제였다.
//솔직히 여태 문제 풀면서 자료형의 크기(범위)에 대해서 별 생각 없었는데
//이 부분도 항상 염두에 두고 풀어야겠다.