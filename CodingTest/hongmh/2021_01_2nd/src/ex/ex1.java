//package ex;
//
//
////문제링크 : https://programmers.co.kr/learn/courses/30/lessons/42840
///*
// * 질문하기를 안보면서 풀려고 했지만, 질문하기를 통해 내가 실수로 놓치고 있는 부분들을 알게 되었다.
// * 앞으로는 종종 참고해봐야겠다...
// * 그리고 조건문들을 어떻게 하면 간략하게 할지 피드백을 주세요 윤권님~~~!!
// */
//
//import java.util.*;
//
////class Solution {
//    public ArrayList<Integer> solution(int[] answers) {
//    	ArrayList<Integer> answer = new ArrayList<>();
//
//        int[] supo1 = {1,2,3,4,5};
//        int[] supo2 = {2,1,2,3,2,4,2,5};
//        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
//        int count_supo1 = roop(supo1,answers);
//        int count_supo2 = roop(supo2,answers);
//        int count_supo3 = roop(supo3,answers);
//        
//        if(count_supo1 > count_supo2 && count_supo1 > count_supo3)
//        	answer.add(1);
//        else if(count_supo2 > count_supo1 && count_supo2 >count_supo3)
//        	answer.add(2);
//        else if(count_supo3 >count_supo1  &&count_supo3 > count_supo2)
//        	answer.add(3);
//        else if(count_supo1 == count_supo2 && count_supo1 == count_supo3 &&count_supo2 == count_supo3) 
//        		for(int i  = 0; i < 3; i++)
//        			answer.add(i+1);
//        else if(count_supo1 == count_supo3) {
//        	answer.add(1);
//        	answer.add(3);
//        }
//        else if(count_supo1 == count_supo2) {
//        	answer.add(1);
//        	answer.add(2);
//        }
//        else if(count_supo2 == count_supo3) {
//        	answer.add(2);
//        	answer.add(3);
//        }
//        	
//        
//        return answer;
//    }
//    
//    public int roop(int[] supo, int[] answers) {
//    	int count = 0;
//    	for(int i = 0; i < answers.length; i++) 
//    		if(supo[i%supo.length] == answers[i])
//    			count++;
//    	
//    	return count;
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
