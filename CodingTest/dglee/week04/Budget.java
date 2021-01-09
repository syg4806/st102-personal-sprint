package week_4;
import java.util.*;
public class Budget {
	 public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        
	        for(int num : d) {
	        	if(budget-num >=0) {
	        		answer++;
	        		budget -=num;
	        	}
	        	else {
	        		break;
	        	}
	        }
	        
	        return answer;
	    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12982
//������ ��ϰ� �� ���� Ǯ�ٺ��ϱ� ������ ���� '��� ��ߵǰڴ�' ��� �������� �ϰ� �ȴ�.
//�̹��� ���ڸ��� ������ ���꿡�� �ִ�� ȿ���� �̾ƾ� �ϱ� ������ �迭�� �����ؼ� ���� ������ ó���ϴ� ������ �ڵ��� �ߵ�.