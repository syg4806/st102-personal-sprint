package week_2;

public class String_basic {

	public boolean solution(String s) {
        
        if(s.length() ==4 || s.length() ==6) {
        	try {
        		Integer.parseInt(s);
        	      return true;
        	  } catch(NumberFormatException e) {
        	      return false;
        	  }
        }
        	
        else {
        	return false;
        }
    }
}
// https://programmers.co.kr/learn/courses/30/lessons/12918
// try-catch문 많이 사용안해봐서 구글링하면서 사용했는데 좋네...재밌네...솔직히 좋아해..
// 다 풀고나서보니까 중괄호 많아서 더러워 보인다. 저  try-catch문 부분 메소드화 시키는게 좋을까?