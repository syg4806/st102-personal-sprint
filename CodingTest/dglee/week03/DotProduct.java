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
//1���� �迭�� ���������� �� ������� ������. n�����϶��� ��� �������� �����غ��߰ڴ�.