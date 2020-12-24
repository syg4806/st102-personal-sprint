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
// list���� �迭�� ��ȯ�ϴ°� ���� ���� ���ϴ�.
// ������ �������� list ��� set����� �Ѱ� set to array �ϴ� ��� ã�ƺôµ�
// �߾ȳ����淡 �ϴ� �׳� �ݺ��� ���ȴµ� �� � �������??
