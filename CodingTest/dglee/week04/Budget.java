package week_4;
import java.util.*;
public class Budget {
	 public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        
	        for(int num : d) {
	        	if(budget-num >=0) {
	        		answer++;
	        		budget -=num;
	        	}
	        	else {
	        		break;
	        	}
	        }
	        
	        return answer;
	    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12982
//어려운거 몇개하고 좀 많이 풀다보니까 문제를 보면 '어떤걸 써야되겠다' 라는 생각부터 하게 된다.
//이번엔 보자마자 정해진 예산에서 최대로 효율을 뽑아야 하기 때문에 배열을 정렬해서 작은 수부터 처리하는 식으로 코딩을 했따.