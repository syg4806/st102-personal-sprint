package Ang;
import java.util.*;
public class Fail_completion {

	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<completion.length;i++) {
        	if(!participant[i].equals(completion[i])) {
        		answer= participant[i];
        		break;
        	}	
        }
        return answer;  
    }
}
//�̿����ڰ� �Ѹ�ۿ� ���� ������ �� �迭�� �����ؼ� ó������ �ٸ� �ε����� ����ϸ� �ƴ�.
