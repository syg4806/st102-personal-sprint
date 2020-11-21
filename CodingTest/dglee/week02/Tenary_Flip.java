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
// stack을 사용해 앞뒤반전을 생략하고 10진법으로 표현하였다.
// 처음에 메모리 초과로 인해서 선언했던 변수들을 없애고 최대한 간결하게 코딩하였다.
// for문에서 처음에는 조건문에 stack.size()를 사용했지만 제대로 나오지 않았다.
// size()메서드가 stack에 쌓여있는 원소의 수를 반환하는지 잘 모르겠다.