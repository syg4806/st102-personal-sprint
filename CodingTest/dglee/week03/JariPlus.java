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
//��� �ڵ������� �ϸ鼭 ���ʿ��� �ڵ���� ���� �����Ϸ��� ����Ѵ�.
//������ ���������� ���׽��͵� ���ٶ����� ���� �������� �����̴�.