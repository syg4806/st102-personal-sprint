package ex;

import java.util.*;


class SOlution {
    public String solution(String phone_number) {
        String answer = "";
        int start = phone_number.length()-4;
        int end = phone_number.length();
        for(int i = 0; i < phone_number.length()-4;i++)
        	answer+="*";
        
        answer+=phone_number.substring(start,end);
        
        return answer;
    }
}

public class ex2 {

	public static void main(String[] args) {
		SOlution sol = new SOlution();
		
		System.out.println(sol.solution("01030247076"));
		

	}

}
