package Ang;
import java.util.*;
public class Crane_machine {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int doll;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<moves.length;i++) {
        	
        	for(int j=0;j<board.length;j++) {
        		
        		if(board[j][moves[i]-1] != 0) {
        			doll = board[j][moves[i]-1];
        			
        			if(stack.empty()) {
        				stack.push(doll);
                	}
        			else {
        				if(stack.peek() ==doll) {
        					stack.pop();
        					answer+=2;
        				}
        				else {
        					stack.push(doll);
        				}
        			}
        			board[j][moves[i]-1]=0;
        			break;
        		}	
        	}
        }
        
        return answer;
    }
}
