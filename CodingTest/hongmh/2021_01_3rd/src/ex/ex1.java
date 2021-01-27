//package ex;
//
////문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12947
//
///*
// * 정수의 자릿값을 이용해서 해결해야 하는 문제는 문자열로 바꿔서 길이를 하는것이 좋은 방법인거 같다!!
// */
//
//class Solution {
//    public boolean solution(int x) {
//        boolean answer = false;
//        String number = Integer.toString(x);
//        int sum = 0;
//        for(int start = 0; start<number.length();start++) 
//        	sum+=Integer.parseInt(number.substring(start,start+1));
//        
//        if(x%sum == 0)
//        	return answer = true;
//        else
//        	return answer;
//    }
//}
//
//public class ex1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
