package week_3;

public class measure {
	
	public int solution(int n) {
        int answer = 0;
        
        for(int i =1; i<=n; i++) {
        	if(n%i==0)
        		answer +=i;
        }
        return answer;
    }

}
//https://programmers.co.kr/learn/courses/30/lessons/12928
//워낙 기본적인 문제라 20초컷한거같은데 더 좋은 코드가 있는지 찾아봐야겠다.