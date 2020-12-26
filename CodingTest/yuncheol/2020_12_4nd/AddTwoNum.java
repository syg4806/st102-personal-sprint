// �ΰ� �̾Ƽ� ���ϱ�
// ��ũ : https://programmers.co.kr/learn/courses/30/lessons/68644
// ���� ��� : �迭 numbers�� ��� �� �ΰ��� �յ� ��ҷ� ������ �迭 answer�� ��ȯ

// ��� �� : Array�� STL ������ �����ο� �̵�, Set<> set = new HashSet<>() �� ����, Iterator�� ����


package ex2.org;

import java.util.*;

class Solution {
	public static int[] solution(int[] numbers) {
		Set<Integer> hashSet = new HashSet<>();
		
		int flag = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				hashSet.add(numbers[i] + numbers[j]);
			}
		}
		
		Iterator<Integer> iter = hashSet.iterator();
		int[] answer = new int[hashSet.size()];
		
		while (iter.hasNext()) {
			answer[flag] = (int)iter.next();
			flag++;
		}
		
		return answer;
	}
}

public class AddTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 200, 300, 400, 500 };
		
		int[] arr2 = Solution.solution(arr);		
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i] + " ");
		}
		
		return;
	}

}
