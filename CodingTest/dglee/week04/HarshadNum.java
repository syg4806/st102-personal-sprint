package week_4;

public class HarshadNum {
	public boolean solution(int x) {
        int dividenum =0;
        int xcopy =x;
        while(true) {
        	dividenum += xcopy%10;
        	if(xcopy<10)
        		break;
        	
        	xcopy/=10;  	
        }
        boolean answer = x%dividenum==0 ? true : false;
     
        return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12947
//�̷� ���� ���� ���ߴ� �������� �ٷ� ���̵� ���ö� ������ Ǯ �� �ִ�.
//���� ������ �� �� ���� ���� if�� ��� ���ַ��� ������̴�. �ξ� �����ϰ� ���̱� �ϴ�.