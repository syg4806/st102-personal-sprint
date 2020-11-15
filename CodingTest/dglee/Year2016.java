package Ang;
import java.util.*;
public class Year2016 {
	public String solution(int a, int b) {
        String answer = "";
        int day=0;
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=1; i<a;i++) {
        	day+=month[i-1];
        }
        day=(day+b)%7;
        switch(day) {
        
        case 0 :
        	answer="THU";
        	break;
        case 1 :
        	answer="FRI";
        	break;
        case 2 :
        	answer="SAT";
        	break;
        case 3 :
        	answer="SUN";
        	break;
        case 4 :
        	answer="MON";
        	break;
        case 5 :
        	answer="TUE";
        	break;
        case 6 :
        	answer="WED";
        	break;
        }
        return answer;
    }
}
//문제는 배열을 이용하면 쉽게 풀 수 있었다.
//다 풀고나서 생각해봤는데 switch문 대신 "요일"을 넣은 배열을 활용하면 코드길이를 줄일 수 있을것 같다.
//ex) String[] dayarr = {THU,FRI,SAT,SUN,MON,TUE,WED};
//    answer = dayarr[day];
	  