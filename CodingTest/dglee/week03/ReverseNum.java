package week_3;
public class ReverseNum {

	public int[] solution(long n) {
		int length = String.valueOf(n).length();
		int[] answer = new int[length];
		String[] strarr = String.valueOf(n).split("");
      
		for (int i=0; i <length; i++) {
			answer[i] = Integer.parseInt(strarr[length-1-i]);
		}
		
		return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12932
//ó������ 10���� ������� ������ ������ ���ؼ� �ߴµ� 3���� �׽�Ʈ���̽��� ������� ���ߴ�.
//�׷��� ���� ���� n�� ���ڿ��� ��ȯ�ϰ� �ɰ��� int�� �迭�� ����ȯ�� ���� ������ �־��־���.
//Ȯ���� ����ȯ�ϴ°� ���� ���Ǳ� ������ ���� ���̴°͵��� �ܿ��δ°� ������ ����.