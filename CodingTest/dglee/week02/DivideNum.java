package week_2;

import java.util.*;

public class DivideNum {

	public int[] solution(int[] arr, int divisor) {
        int[] answer= {};
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i : arr) {
        	if(i%divisor==0) 
        		list.add(i);
        }
        if(list.size()==0)
        	answer = new int[] {-1};
        else {
        	answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        Arrays.sort(answer);
        return answer;
    }
}
// https://programmers.co.kr/learn/courses/30/lessons/12910
// list에서 배열로 변환하는거 저거 존나 편하다.
// 지난주 문제에서 list 대신 set쓰라고 한거 set to array 하는 방법 찾아봤는데
// 잘안나오길래 일단 그냥 반복문 돌렸는데 넌 어떤 방법쓰니??
