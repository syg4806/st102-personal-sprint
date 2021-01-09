package Test_2;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12922
/*
 * 각 문자열 배열을 이제 하나의 문자열로 반환하는것은
 * 반복문으로 해결해야 한다는것을 확실히 알았다!!
 */

class Solution {
    public String solution(int n) {
        String answer = "";
        String[] put_answer  = new String[n];
        for(int i = 0; i < n; i++) {
        	if(i%2 == 0)
        		put_answer[i] = "수";
        	else
        		put_answer[i] = "박";
        }
        for(int i = 0; i < n; i++) {
        	answer+=put_answer[i];
        }
        
        return answer;
    }
}

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
