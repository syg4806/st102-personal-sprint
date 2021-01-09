package week_4;

import java.util.*;
public class ReverseOrder {
	public long solution(long n) {
		String input = Long.toString(n);
		String output ="";
		String[] inputarr = input.split("");
		
		Arrays.parallelSort(inputarr,Collections.reverseOrder());
		for(String num : inputarr) {
			output += num;
		}
        return Long.parseLong(output);
    }
}

//https://programmers.co.kr/learn/courses/30/lessons/12933
//문제 난이도가 쉬워서 금방 풀 수 있었다. 
//다른 사람의 코드를 보니 람다식을 사용했는데, 확실히 코드의 길이가 짧고, 변수 선언이 적다는 장점이 있었다.
//람다식도 공부해서 자유자재로 쓸 수 있게 만들어야겠다.