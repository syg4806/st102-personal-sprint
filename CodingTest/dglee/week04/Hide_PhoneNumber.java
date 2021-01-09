package week_4;

public class Hide_PhoneNumber {
	 public String solution(String phone_number) {
	        String answer = "";
	        String[] Strarr = phone_number.split("");
	        for(int index=0; index<Strarr.length-4; index++) {
	        	Strarr[index]="*";
	        }
	        answer = String.join("", Strarr);
	        return answer;
	    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12948
//String 배열을 String으로 바꾸는 방법중에 join이라는 방법을 찾았다.
//자바하면서 처음 보는데 자주 활용해야겠다.