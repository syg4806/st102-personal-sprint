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
//미완주자가 한명밖에 없기 때문에 두 배열을 정렬해서 처음으로 다른 인덱스만 고려하면 됐다.
