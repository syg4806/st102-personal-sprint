package Test_1;

//문제링 : https://programmers.co.kr/learn/courses/30/lessons/12919
/*
 * easy...
 */
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int x = 0;x < seoul.length;x++) {
        	if(seoul[x].equals("Kim")) {
        		answer="김서방은 "+x+"에 있다";
        	}
        	
        }
        return answer;
    }
}

public class test1 {

	public static void main(String[] args) {
	
	}

}
