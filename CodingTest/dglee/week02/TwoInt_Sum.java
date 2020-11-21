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
// a�� b�� ��Ұ���� solution�޼��忡�� �����ϰ� a,b�� ������ ������ ������ ���� �޼���ȭ�Ͽ���.