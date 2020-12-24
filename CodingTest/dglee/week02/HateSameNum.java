package week_2;
import java.util.*;
public class HateSameNum {
	 public int[] solution(int []arr) {
	        int[] answer = {};
	        List<Integer> list = new ArrayList<Integer>();	
	        int i=0;
	        list.add(arr[0]);
	        for(int index : arr) {
	        	if(index != list.get(i)) {
	        		list.add(index);
	        		i++;	        		
	        	}
	        }
	        answer = list.stream().mapToInt(Integer::intValue).toArray();
	        return answer;
	    }

}
// https://programmers.co.kr/learn/courses/30/lessons/12906
// ���� list�� array�� ��ȯ�Ҷ� for���� ���� �ݺ��ؼ� index�� ä���־��µ�
// �� list to array ��ȯ ����� ����ϸ� �ڵ� ���ٸ����ε� �����ϴ�.
// �̰� ���� �ٸ� ����� ���Ҵµ� �̰� ���� ������ ����ΰ� ����.