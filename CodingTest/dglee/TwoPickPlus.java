package Ang;
import java.util.*;

public class TwoPickPlus {
	 public int[] solution(int[] numbers) {
		 int[] answer;
		 HashSet<Integer> set = new HashSet<Integer>();

		 for(int index1=0;index1<numbers.length;index1++) {
			 for(int index2=0;index2<numbers.length;index2++) {
				 if(index1 != index2)
					 set.add(numbers[index1] +numbers[index2]);			
			     }
			 }
		 answer = new int[set.size()];
		 int i=0;
		 for(int index : set)
			 answer[i++] = index;
		 Arrays.sort(answer);
		 return answer;
		}
}
