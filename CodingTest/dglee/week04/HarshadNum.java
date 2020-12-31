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
//이런 쉽고 많이 접했던 문제들은 바로 아이디어가 떠올라서 빠르게 풀 수 있다.
//조건 연산자 쓸 수 있을 때는 if문 대신 써주려고 노력중이다. 훨씬 간결하게 보이긴 하다.