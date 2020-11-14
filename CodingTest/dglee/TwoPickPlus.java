package Ang;
import java.util.*;

public class TwoPickPlus {
	 public int[] solution(int[] numbers) {
		 int[] answer;
	        
	        List<Integer> list = new ArrayList<Integer>();
	        
	        for(int index1=0;index1<numbers.length;index1++) {
	        	for(int index2=0;index2<numbers.length;index2++) {
	        		if(index1 != index2) {
	        			int insert = numbers[index1] +numbers[index2];
	        			if(list.indexOf(insert) ==-1) 
	        			list.add(insert);	
	        		}
	        		
	        	}
	        }
	        Collections.sort(list);
	        answer = new int[list.size()];
	        
	        for(int i=0;i<list.size();i++) {
	        	answer[i]=list.get(i);
	        }
	       
	        return answer;
	    }
}
