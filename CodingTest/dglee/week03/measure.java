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
//���� �⺻���� ������ 20�����ѰŰ����� �� ���� �ڵ尡 �ִ��� ã�ƺ��߰ڴ�.