// 완주하지 못한 선수
// 링크 :https://programmers.co.kr/learn/courses/30/lessons/42576
// 문제요약 : 참가자 중 완주하지 못한 선수 구하기

// 배울 것 : HashSet 공부하기
// 해볼 것 : 참가자와 완주자를 입력 받아 완주하지 못한 선수들 구하기


package ex3.org;

import java.util.*;

class Solution {
	public static String solution (String[] participant, String[] completion) {
		Set<String> participantSet = new HashSet<>();
		Set<String> completionSet = new HashSet<>();
		String answer = " ";
		
		for (int i = 0; i < participant.length; i++) {
			participantSet.add(participant[i]);
		}
		for (int i = 0; i < completion.length; i++) {
			completionSet.add(completion[i]);
		}
		
		participantSet.removeAll(completionSet);
		Iterator<String> iter = participantSet.iterator();
		
		answer = (String)iter.next();
		
		return answer;
	}
}

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant1 = { "leo", "kiki", "eden" };
		String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		
		String[] completion1 = { "eden", "kiki" };
		String[] completion2 = { "marina", "josipa", "nikola", "filipa" };
		
		System.out.println(Solution.solution(participant1, completion1));
		System.out.println(Solution.solution(participant2, completion2));
	}

}
