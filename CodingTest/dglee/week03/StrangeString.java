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
// ó���� ����� ���ϴ� ������ �������µ�, �˰��� �� �� if������ ���ڿ��� == �� �����ְ� �־���.
// ���ڿ� �ּҸ� ���ϰ� �����ϱ� �ɸ��� ������ ���� �����ϸ� �̷� �Ǽ� ���� �޼������ ���� Ȱ���ؾ߰ڴ�.
