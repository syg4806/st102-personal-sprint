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
// n�� ũ�Ⱑ ������ �������� �ð����⵵�� �������� n�� ũ�Ⱑ ũ�� �ð� �ʰ��� �ȴ�.
// ���� ����� ������, ȹ�������� �ð����⵵�� ���� ����� ������ �ȳ��� �ϴ� �̷��� ����.
// �ٸ� ����� ����� ã�ƺ��ϱ� �����佺�׳׽��� ü�� �̿��ϴ� ����� ���� ������
// ���鼭 �м��� �ؾ߰ڴ�.