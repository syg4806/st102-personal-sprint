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

//int형 배열을 정수형 list로 변환하기 위해 구글링을 한 결과 아래 코드를 쓰는게 유일한 방법이였다.(수동 제외)
//Arrays.stream(arr).boxed().collect(Collectors.toList());
//근데 이클립스에서는 딱히 에러가 없었는데 프로그래머스에서 코드를 실행하니까 저 Collectors라는걸 변수로 취급해서 안된다더라
//ㅈㄴ 고민하다가 걍 손절했다.
//또 아래 코드와 같이 list를 배열로 변환하는 코드에서 윤권이가 알려준 filter를 사용해서 remove 부분 코드를 줄이려했는데
//list.stream().mapToInt(Integer::intValue).toArray();
//filter 안에 변수는 값이 확정된것(final)을 사용해야해서 로컬변수 min을 사용하지 못했다.
//솔직히 list 안쓰고 그냥 배열인덱스 활용해서 하거나 다른 방법 썼으면 편했겠지만
//이번에 제대로 헤메면서 list, stream 등 몰랐던거 많이 알아가서 좋았다.
