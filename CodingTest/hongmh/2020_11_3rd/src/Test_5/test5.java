package Test_5;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12906
/*
 * 비교되는 첫번째 요소를 compare에 저장해 비교후 temp에 저장. 그리고 answer에 복사!!
 */

import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int[] temp = new int[arr.length];
        int compare = arr[0];
        temp[0] = compare;
        int count = 1;
        
        for(int i =1; i<arr.length;i++) {
        	if(compare == arr[i])
        		continue;
        	else {
        		temp[count++] = arr[i];
        		compare = arr[i];
        	}
        }
        answer = new int[count];
        answer = Arrays.copyOfRange(temp, 0, count);
        
        
        
        return answer;
    }
}


public class test5 {

	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		
		Solution sol = new Solution();
		System.out.println(Arrays.toString(sol.solution(arr)));

	}

}
