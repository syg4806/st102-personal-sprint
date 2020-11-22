package Test_3;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12901
/**
 * 구글링해서 Calendar의 내장함수를 이용했음. 
 * 근데 궁금한게 여기 안에서 실행했을때에는 MON이 출력되는데
 * 코테상에서는 TUE로 출력돼서 일단 이렇게 제출함!!
 */

import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] arrWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        if(a == 2 && b >29)
        	return "error!";
        
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1,b);
        answer = (arrWeek[cal.get(Calendar.DAY_OF_WEEK)-1]);
           
        return answer;
    }
    
}

public class test3 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(5,23));

	}

}
