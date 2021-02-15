//package ex;
//
////문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12932
//
///*
// * StringBuffer를 처음 이용해 봤는데 실무에서도 많이 사용되는지??? 꼭 필요한 부분인지 알려주세용~~~
// */
//
//
//class Solution {
//    public int[] solution(long n) {
//        
//    	StringBuffer str = new StringBuffer(Long.toString(n));
//    	str = str.reverse();
//        int[] answer = new int[str.length()];
//        
//        for(int i = 0; i < str.length();i++)
//        	answer[i]=(int)Long.parseLong(str.substring(i,i+1));
//        
//        return answer;
//    }
//}
//
//
//public class ex3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
