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
//Math클래스의 제곱,제곱근을 구하는 메소드를 사용하면 쉽게 풀 수 있는 문제였다.