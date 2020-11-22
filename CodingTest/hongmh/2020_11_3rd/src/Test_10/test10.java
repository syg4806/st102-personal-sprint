package Test_10;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        int[] temp = new int[arr.length];
        
        for(int each_arr : arr) {
        	if(each_arr%divisor == 0) {
        		temp[count++] = each_arr;
        	}	
        }
        for(int each : temp)
        	System.out.println(each);
        
        if(count == 0) {
        	temp[0] = -1;
        	count++;
        }

        answer = Arrays.copyOf(temp, count);
        Arrays.sort(answer);
        
        return answer;
    }
}

public class test10 {

	public static void main(String[] args) {
		int arr[] = {5,9,7,10};
		Solution sol = new Solution();
		System.out.println(sol.solution(arr,5));

	}

}
