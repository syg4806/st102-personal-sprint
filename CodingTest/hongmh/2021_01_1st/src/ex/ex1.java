package ex;

//문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12921

/*
 * 에라토스테네스의 체라는 좋은 알고리즘을 알게 됐다!!
 */

class Solution {
    public int solution(int n) {
    	int answer=0;
    	boolean[] arr = new boolean[n+1];
    	arr[0] = arr[1] = true;
    	
    	for(int i = 2; i*i<=n; i++) {
    		if(!arr[i]) {
    			for(int j = i*i; j<=n; j+=i)
    				arr[j] = true;
    		}
    	}
    	for(int i= 1; i<=n;i++)
    		if(!arr[i])
    			answer++;
    	return answer;
    	
    }
}

public class ex1 {

	public static void main(String[] args) {
		
	}
	
	

}
