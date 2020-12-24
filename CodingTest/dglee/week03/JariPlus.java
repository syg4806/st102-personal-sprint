package week_3;

public class JariPlus {
	public int solution(int n) {
		int answer = 0;
		while(true) {
			answer += n%10;
	        if(n<10)
	        	break;
	        
	        n/=10;
	       }
	        return answer;
	    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12931
//계속 코딩연습을 하면서 불필요한 코드들을 많이 생략하려고 노력한다.
//예전에 태형이형이 코테스터디 봐줄때보다 많이 간결해진 느낌이다.