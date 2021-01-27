package ex;

//문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12937

class Solution {
    public String solution(int num) {
        if(num%2 == 0)
        	return "Even";
        else
        	return "Odd";
       
    }
}
public class ex4 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(19));

	}

}
