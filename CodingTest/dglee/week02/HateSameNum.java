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
// 여태 list를 array로 변환할때 for문을 통해 반복해서 index를 채워넣었는데
// 이 list to array 변환 방법을 사용하면 코딩 한줄만으로도 가능하다.
// 이거 말고도 다른 방법도 많았는데 이게 가장 간결한 방법인것 같다.