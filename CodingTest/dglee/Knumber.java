package Ang;
import java.util.*;
public class Knumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
        
        for(int i=0; i<answer.length;i++) {
        	//아무 생각없이 배열의 크기를 array크기만큼 했었다가 자꾸 배열에 0이 들어가서 왜 그런지 고민을 준내게 많이 함
        	int[] subarr = new int[commands[i][1]-commands[i][0]+1];
            
        	for(int j=0; j<commands[i][1]-commands[i][0]+1;j++) {
        		subarr[j] = array[j+commands[i][0]-1];
        	}
            
            Arrays.sort(subarr);
        	answer[i] = subarr[commands[i][2]-1];
        }
 
        return answer;
    }
}
//처음에는 배열을 문자열로 옮겨 substring 등을 통해 했으나 
//잘 되지도 않고 코드가 길어져서 그냥 배열 하나를 더 선언해서 그 배열안에 쪼개 넣었다.




