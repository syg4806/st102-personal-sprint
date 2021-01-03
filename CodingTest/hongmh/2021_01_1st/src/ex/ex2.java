package ex;


//문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12935

/*
 * 중간에 껴있는 값을 삭제하기 용이한 리스트를 사용했다!!뿌___듯^_^
 */
import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {
        int min = arr[0];
        int index = 0;
    	for(int i = 0; i < arr.length;i++) {
    		if(min > arr[i]) {
    			min = arr[i];
    			index = i;
    		}
    	}
    			
        List<Integer> copy_list = new ArrayList<>();
        if(arr.length > 1) {
	        for(int i = 0; i <arr.length;i++)
	        	copy_list.add(arr[i]);
	       
	        copy_list.remove(index);
        
        }else
        	copy_list.add(-1);
        
        return copy_list;
    }
}

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
