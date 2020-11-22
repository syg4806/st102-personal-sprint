package Test_6;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12912
/*
 * 꽁짜 문제 개꿀 ㅎㅎㅎㅎㅎ 걍 비교해서 반복문~
 */
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a<b) {
	        for(int i = a; i <= b; i++) {
	        	answer +=i;
	        }
        }else {
        	for(int i = b; i <= a; i++) {
	        	answer +=i;
	        }
        }
        	
        return answer;
    }
}
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
