package week_4;

public class MatrixPlus {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int num1 =0;num1<answer.length;num1++) {
        	for(int num2 =0;num2<answer[0].length;num2++) {
            	answer[num1][num2] =arr1[num1][num2] + arr2[num1][num2];
            }
        }
        return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12950
//단순히 행렬의 덧셈이라 2중for문을 통해 더해줬다.