package Ang;
import java.util.*;
public class Knumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
        
        for(int i=0; i<answer.length;i++) {
        	//�ƹ� �������� �迭�� ũ�⸦ arrayũ�⸸ŭ �߾��ٰ� �ڲ� �迭�� 0�� ���� �� �׷��� ����� �س��� ���� ��
        	int[] subarr = new int[commands[i][1]-commands[i][0]+1];
            
        	for(int j=0; j<commands[i][1]-commands[i][0]+1;j++) {
        		subarr[j] = array[j+commands[i][0]-1];
        	}
            
            Arrays.sort(subarr);
        	answer[i] = subarr[commands[i][2]-1];
        }
 
        return answer;
    }
}
//ó������ �迭�� ���ڿ��� �Ű� substring ���� ���� ������ 
//�� ������ �ʰ� �ڵ尡 ������� �׳� �迭 �ϳ��� �� �����ؼ� �� �迭�ȿ� �ɰ� �־���.




