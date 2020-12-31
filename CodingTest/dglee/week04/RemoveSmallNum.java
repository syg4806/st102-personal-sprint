package week_4;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveSmallNum {
	 public int[] solution(int[] arr) {
		 List<Integer> list = new ArrayList<Integer>();
		 int[] answer;
		 
		 if(arr.length ==1)
			 answer = new int[]{-1};
		 
		 else { 
			 int min = arr[0];
			 for(int num : arr)
				 list.add(num);
 
			 for(int i : list) {
				 if(min>i)
					 min = i;
				 }
			 
			 list.remove(list.indexOf(min));
			 answer = list.stream().mapToInt(Integer::intValue).toArray();
			 }
		 
		return answer; 
		}
}
//https://programmers.co.kr/learn/courses/30/lessons/12935

//int�� �迭�� ������ list�� ��ȯ�ϱ� ���� ���۸��� �� ��� �Ʒ� �ڵ带 ���°� ������ ����̿���.(���� ����)
//Arrays.stream(arr).boxed().collect(Collectors.toList());
//�ٵ� ��Ŭ���������� ���� ������ �����µ� ���α׷��ӽ����� �ڵ带 �����ϴϱ� �� Collectors��°� ������ ����ؼ� �ȵȴٴ���
//���� ����ϴٰ� �� �����ߴ�.
//�� �Ʒ� �ڵ�� ���� list�� �迭�� ��ȯ�ϴ� �ڵ忡�� �����̰� �˷��� filter�� ����ؼ� remove �κ� �ڵ带 ���̷��ߴµ�
//list.stream().mapToInt(Integer::intValue).toArray();
//filter �ȿ� ������ ���� Ȯ���Ȱ�(final)�� ����ؾ��ؼ� ���ú��� min�� ������� ���ߴ�.
//������ list �Ⱦ��� �׳� �迭�ε��� Ȱ���ؼ� �ϰų� �ٸ� ��� ������ ���߰�����
//�̹��� ����� ��޸鼭 list, stream �� �������� ���� �˾ư��� ���Ҵ�.
