package week_2;

public class Prime_number {

	public int solution(int n) {
		int answer = 0;
        
        for(int i=1; i<=n;i++) {
        	
        	for(int j=2; j<=i; j++) {
        		if(i%j==0) {
        			if(j==i)
        				answer++;	
        			break;
        		}	
        	}
        }
        return answer;
    }
}
// https://programmers.co.kr/learn/courses/30/lessons/12921
// n의 크기가 작으면 괜찮은데 시간복잡도가 줘터져서 n의 크기가 크면 시간 초과가 된다.
// 줄일 방법은 있지만, 획기적으로 시간복잡도를 줄일 방법은 생각이 안나서 일단 이렇게 낸다.
// 다른 사람들 방법을 찾아보니까 에라토스테네스의 체를 이용하는 방법을 많이 쓰던데
// 보면서 분석좀 해야겠다.