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
//String �迭�� String���� �ٲٴ� ����߿� join�̶�� ����� ã�Ҵ�.
//�ڹ��ϸ鼭 ó�� ���µ� ���� Ȱ���ؾ߰ڴ�.