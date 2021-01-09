package Test_9;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12916
/*
 * 문자열을 각 char배열에 넣어 count 해주고 비교한 후 결과 값 반환.
 */

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] array = new char[s.length()];
        int count_p = 0;
        int count_y = 0;
        for(int i = 0; i < array.length; i++) {
        	array[i] = s.charAt(i);
        	if(array[i] == 'p' || array[i] == 'P')
        		count_p++;
        	if(array[i] == 'y' || array[i] == 'Y')
        		count_y++;
        }
        
        if(count_p == count_y)
        	return answer=true;
        else
        	return answer=false;
        
    }
}

public class test9 {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		System.out.println(sol.solution("Zbcdfg"));
	}

}
