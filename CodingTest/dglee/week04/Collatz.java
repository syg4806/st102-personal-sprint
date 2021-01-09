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
//���������� �����ߴ��ſ��µ�, �ڵ� ��ü���� ������ ������, �Ű������� �ڷ����� ��������.
//������ ���� ���� Ǯ�鼭 �ڷ����� ũ��(����)�� ���ؼ� �� ���� �����µ�
//�� �κе� �׻� ���ο� �ΰ� Ǯ��߰ڴ�.