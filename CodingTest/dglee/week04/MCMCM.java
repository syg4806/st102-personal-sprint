package week_4;

public class MCMCM {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = n<m ? n : m;
        int big = n>m ? n : m;
        
        for(;min>0;min--) {
        	if(n%min==0&&m%min==0) {
        		answer[0] = min;
        		break;
        	}      		
        }
        
        for(;;big++) {
        	if(big%n==0&&big%m==0) {
        		answer[1] = big;
        		break;
        	}      		
        }
        
        return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12940
//�ִ�����, �ִ����� ���ϴ� �������µ� ������!
//�ڵ� �� ���� �� �ٿ������� �ߴµ� �׷� �ʹ� �������� ���������� ���� ���·� �����ߴ�.