
//문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12926

/*
 * 음...아스키코드 부분에서 형변환에서 조금 헤맸음...
 * 그리고 남들 코드를 비교하면서 좋은코드인지 아닌지 어떻게 받아들이면 좋을지 팁좀 주세요!!
 * 뭐가 좋은거이고 나쁜거인지 몰라서 선뜻 받아들이는게 쉽지가 않네요...
 */
import java.nio.charset.StandardCharsets;
import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        
        for(int i  = 0; i<s.length();i++) {
        	if(Character.isUpperCase(s.charAt(i))) {
        		if(bytes[i]+n>90)
        			answer+= Character.toString((char)(bytes[i]+n-26));
        		else
        			answer+= Character.toString((char)(bytes[i]+n));
        	}else if(Character.isLowerCase(s.charAt(i))) {
        		if(bytes[i] + n > 122)
        			answer+= Character.toString((char)(bytes[i]+n-26));
        		else
        			answer+= Character.toString((char)(bytes[i]+n));
        	}else
        		answer+=" ";
        			
        }
        return answer;
    }
}

public class ex2 {

	public static void main(String[] args) {

	}

}
