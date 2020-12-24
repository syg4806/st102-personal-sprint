package week_2;
import java.util.*;
public class Tenary_Flip {
	public int solution(int n) {
        int answer = 0;
        int remainder;
        Stack<Integer> stack = new Stack<Integer>();
        
        while(n!=0) {
        	remainder= n%3;
        	stack.push(remainder);
        	n = n/3;
        }
        for(int i=0;!stack.empty();i++) {
        	answer+= Math.pow(3, i)*stack.pop();
        }
        return answer;
    }
}
// https://programmers.co.kr/learn/courses/30/lessons/68935
// stack�� ����� �յڹ����� �����ϰ� 10�������� ǥ���Ͽ���.
// ó���� �޸� �ʰ��� ���ؼ� �����ߴ� �������� ���ְ� �ִ��� �����ϰ� �ڵ��Ͽ���.
// for������ ó������ ���ǹ��� stack.size()�� ��������� ����� ������ �ʾҴ�.
// size()�޼��尡 stack�� �׿��ִ� ������ ���� ��ȯ�ϴ��� �� �𸣰ڴ�.