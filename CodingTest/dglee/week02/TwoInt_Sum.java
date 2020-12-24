package week_2;

public class TwoInt_Sum {

	public long solution(int a, int b) {
        long answer = 0;
        if(a<b)
        	answer = sum(a,b);
        else if(a>b)
        	answer = sum(b,a);
        else {
        	answer =a;
        }
        return answer;
    }
	
	public long sum(int min, int max) {
		long sum=0;
		for(int i=min;i<=max;i++) {
			sum+=i;
		}
		return sum;
	}
}

//https://programmers.co.kr/learn/courses/30/lessons/12912
// a와 b의 대소관계는 solution메서드에서 구분하고 a,b를 포함한 사이의 숫자의 합은 메서드화하였다.