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
//���� ���̵��� ������ �ݹ� Ǯ �� �־���. 
//�ٸ� ����� �ڵ带 ���� ���ٽ��� ����ߴµ�, Ȯ���� �ڵ��� ���̰� ª��, ���� ������ ���ٴ� ������ �־���.
//���ٽĵ� �����ؼ� ��������� �� �� �ְ� �����߰ڴ�.