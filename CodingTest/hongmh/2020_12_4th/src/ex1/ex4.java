package ex1;


class Solution {
    public String solution(String s) {
        String answer = "";
        int half = s.length()/2;
        if(s.length()%2 == 1)
        	return s.substring(half,half);
        else
        	return s.substring(half,half+1);
    }
}

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
