
//문제링크 : https://programmers.co.kr/learn/courses/30/lessons/42576

/*
 * 코드가 간결하다고 해서 효율성이 높냐? 그건 아니라는걸 알게됐다.
 * 해쉬를 이용해서 코드를 짜면 더 효율성이 높다고 하는데 아직 내 수준에서는 어려운거 같음..ㅎㅎ
 * 근데 윤권씨 여기서 테스트를 통과할 정도면 괜찮은 코드가 맞나요??!!
 */
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
    	Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length;i++)
        	if(!participant[i].equals(completion[i]))
        		return participant[i];
 
        return participant[completion.length];
    }
}

public class ex1 {

	public static void main(String[] args) {
		
	}

}
