package Test_8;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12918
/*
 *	처음으로 try문을 써봄... 그리고 정확성부분에서 오류를 수정해봄 뿌듯ㅎㅎㅎ
 *	try문은 더 공부를 해야겠다.
 */
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if((s.length() == 4 || s.length() == 6)) {
        	try{
        		Integer.parseInt(s);
        		return answer;
        	}catch (Exception e) {
        		return false;
        	}
        	
        }else {
        	return false;
        }
      
    }
}

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
