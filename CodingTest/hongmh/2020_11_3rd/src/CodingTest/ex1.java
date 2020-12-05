package CodingTest;
//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42748?language=java

/**
 *answer에 commands길이만큼 할당을 해주고 Arrays를 이용해 복사,정렬하여 답을 구함.
 */
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        int[] copyArray = {};
        
        if(array.length >=1 && array.length <= 100) {
        	for(int i =0; i < commands.length; i++) {
        			copyArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        			Arrays.sort(copyArray);  
        			if((copyArray[commands[i][2]-1]) >=1 || (copyArray[commands[i][2]-1]) <=100)
        				answer[i] = copyArray[commands[i][2]-1];
        	}
        }
        return answer;
    }
}

