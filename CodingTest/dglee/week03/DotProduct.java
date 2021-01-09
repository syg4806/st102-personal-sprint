package week_3;

public class DotProduct {

	public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i< a.length;i++) {
        	answer += a[i]*b[i];
        }
        return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/70128
//1차원 배열의 내적문제라 별 어려움이 없었다. n차원일때도 어떻게 구현할지 생각해봐야겠다.