package week_4;
import java.util.*;
public class SquareRoot {
	 public long solution(long n) {
	        double square = Math.sqrt(n);
	        
	        if(square == (int)square) {
	        	return (long)Math.pow(square +1,2);
	        }
	        else {
	        	return -1;
	        }
       }
}

//https://programmers.co.kr/learn/courses/30/lessons/12934
//MathŬ������ ����,�������� ���ϴ� �޼ҵ带 ����ϸ� ���� Ǯ �� �ִ� ��������.