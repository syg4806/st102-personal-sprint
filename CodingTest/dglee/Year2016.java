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
//������ �迭�� �̿��ϸ� ���� Ǯ �� �־���.
//�� Ǯ���� �����غôµ� switch�� ��� "����"�� ���� �迭�� Ȱ���ϸ� �ڵ���̸� ���� �� ������ ����.
//ex) String[] dayarr = {THU,FRI,SAT,SUN,MON,TUE,WED};
//    answer = dayarr[day];
	  