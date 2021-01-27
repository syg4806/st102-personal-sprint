//package ex;
//
//
////문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12943
//
///*
// * 생각보다 조건이 까다로웠던 문제 이런 조건까지 생각을 해야하나??? 라는 생각이 들정도..
// * 1일때는 0을 반환해줘야하고 자료값도 생각해줘야하는... 에러가나면 자료형과 조건문도 생각해봐야겠다.
// */
//
//class Solution {
//    public int solution(long num) {
//        int answer = -1;
//        
//        if(num == 1)
//        	return 0;
//        for(int i = 0; i < 500;i++) {
//        	if(num%2 == 0)
//        		num/=2;
//        	else
//        		num = (num*3)+1;
//        	
//        	if(num == 1)
//        		return i+1;
//        }
//        
//        return answer;
//    }
//}
//
//public class ex2 {
//
//	public static void main(String[] args) {
//		Solution sol = new Solution();
//		System.out.println(sol.solution(626331));
//
//	}
//
//}
