package week_4;

public class Average {
	public double solution(int[] arr) {
        double answer = 0;
        for(double num : arr) {
        	answer +=num;
        }
        return answer/arr.length;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12944
// ������ ���� �Ϳ���.... 
// �������� �������� �ʴ� �������� �ڵ� �� ���� ���̱� ���� return�Ҷ� ������ ���� �ϰ� �ִ�.