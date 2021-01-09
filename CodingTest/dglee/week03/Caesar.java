package week_3;
import java.util.*;
public class Caesar {

	public String solution(String s, int n) {
		String answer="";
    
        for(int i=0; i<s.length();i++) {
        	int caesar =s.charAt(i)+n;
        	if((s.charAt(i))==32)
        		answer+=" ";
        	else {
        		if(!((s.charAt(i)<91&&caesar<91)||(s.charAt(i)>96&&caesar<123)))
        			caesar = caesar-26;
        			
        		answer +=String.valueOf((char)(caesar));
        	}         	
        }        
        return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12926
//아스키 코드를 쓰는거라서 많이 헤맨 문제였다.
//조건문을 어떻게 하는지에 따라 테스트 케이스 통과율이 다 달랐는데
//오히려 난잡했었던(else에 if문 3개였었음)코드를 생각을 하면서 간결하게 만드니 더 정확하게 되었다.