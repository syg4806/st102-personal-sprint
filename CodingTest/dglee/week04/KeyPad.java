package week_4;

class Position{
	int xpos;
	int ypos;
	public Position(int xpos, int ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}
	public void SetPosition(int xpos, int ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}
	
	public int getxpos() {
		return xpos;
	}
	
	public int getypos() {
		return ypos;
	}
	
	public int Distance(int x, int y) {
		return Math.abs(xpos-x) + Math.abs(ypos-y);
	}
}

public class KeyPad {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		Position Left = new Position(4,1);
		Position Right = new Position(4,3);
		
		for(int num : numbers) {
			switch(num){
				case 1 :
					Left.SetPosition(1, 1);
					answer+="L";
					break;
				case 4 :
					Left.SetPosition(2, 1);
					answer+="L";
					break;
				case 7 :
					Left.SetPosition(3, 1);
					answer+="L";
					break;			
				case 3 :
					Right.SetPosition(1, 3);
					answer+="R";
					break;
				case 6 :
					Right.SetPosition(2, 3);
					answer+="R";
					break;
				case 9 :
					Right.SetPosition(3, 3);
					answer+="R";
					break;
					
				case 2 :
					if(Left.Distance(1, 2)<Right.Distance(1, 2)) {
						Left.SetPosition(1, 2);
						answer+="L";
					}
					else if(Left.Distance(1, 2)>Right.Distance(1, 2)) {
						Right.SetPosition(1, 2);
						answer+="R";
					}
					else {
						if(hand.equals("left")) {
							Left.SetPosition(1, 2);
							answer+="L";
						}
						else{
							Right.SetPosition(1, 2);
							answer+="R";
						}		
					}	
					break;
					
				case 5 :
					if(Left.Distance(2, 2)<Right.Distance(2, 2)) {
						Left.SetPosition(2, 2);
						answer+="L";
					}
					else if(Left.Distance(2, 2)>Right.Distance(2, 2)) {
						Right.SetPosition(2, 2);
						answer+="R";
					}
					else {
						if(hand.equals("left")) {
							Left.SetPosition(2, 2);
							answer+="L";
						}
						else{
							Right.SetPosition(2, 2);
							answer+="R";
						}		
					}	
					break;
					
				case 8 :
					if(Left.Distance(3, 2)<Right.Distance(3, 2)) {
						Left.SetPosition(3, 2);
						answer+="L";
					}
					else if(Left.Distance(3, 2)>Right.Distance(3, 2)) {
						Right.SetPosition(3, 2);
						answer+="R";
					}
					else {
						if(hand.equals("left")) {
							Left.SetPosition(3, 2);
							answer+="L";
						}
						else{
							Right.SetPosition(3, 2);
							answer+="R";
						}		
					}	
					break;
					
				case 0 :
					if(Left.Distance(4, 2)<Right.Distance(4, 2)) {
						Left.SetPosition(4, 2);
						answer+="L";
					}
					else if(Left.Distance(4, 2)>Right.Distance(4, 2)) {
						Right.SetPosition(4, 2);
						answer+="R";
					}
					else {
						if(hand.equals("left")) {
							Left.SetPosition(4, 2);
							answer+="L";
						}
						else{
							Right.SetPosition(4, 2);
							answer+="R";
						}		
					}	
					break;
			}
		}
		
		return answer;
		}
	}
//https://programmers.co.kr/learn/courses/30/lessons/67256
//개같이 짜봤는데 어때 윤권아?
//아이디어는 보자마자 구조체가 생각나서 class 하나 더 만들어서 활용해봤어!
//switch문을 사용하니까 편하기는한데 코드가 많이 늘어난다. 
//이 흐름은 유지하면서 코드를 줄일 수 있는 좋은 방법 읎을까?
//한방에 통과해서 기분이 넘모 좋다 ㅎㅎ



