package week_2;
public class Find_Kim {

	 public String solution(String[] seoul) {
	        String answer = "";
	        int x=0;
	        for(int i=0; i<seoul.length;i++) {
	        	if(seoul[i].equals("Kim")) {
	        		x=i;
	        		break;
	        	}
	        }
	        answer = "�輭���� " + x +"�� �ִ�";
	        return answer;
	    }
}

//https://programmers.co.kr/learn/courses/30/lessons/12919
//����...����...
