package week_3;

public class StrangeString {
	 public String solution(String s) {
		 	String answer = "";
	        String[] strarr = s.split("");
	        Boolean Even = true;
	        
	        for(int i=0; i<s.length(); i++)
	        {
	        	if(strarr[i].equals(" ")){
                 Even = true;
                 answer +=" ";
             }
	        		
	        	else {
	        		if(!Even) {
	        			answer +=strarr[i].toLowerCase();
	        			Even = true;
	        		}
	        		else {
	        			answer +=strarr[i].toUpperCase();
	        			Even = false;
	        		}  		
	        	}
	        }
	        
	        return answer;
	    }

}
//https://programmers.co.kr/learn/courses/30/lessons/12930
// 처음에 통과를 못하는 이유를 몰랐었는데, 알고보니 맨 위 if문에서 문자열을 == 로 비교해주고 있었다.
// 문자열 주소를 비교하고 있으니까 될리가 없었다 ㅎㅎ 웬만하면 이런 실수 없게 메서드들을 자주 활용해야겠다.
