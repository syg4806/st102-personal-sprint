package week_3;
import java.util.*;
public class Watermelon {
	 public String solution(int n) {
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i=0;i<n/2;i++)
        		sb.append("����");
	       
	        if(n%2==1){
	        	sb.append("��");
	        }
	        return sb.toString();
	    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12922
//StringBuilder�� �׳� ���ڿ� String�� �ƹ����Գ� ���� �ϴµ�
//���� � ��Ȳ���� ��� ���°� ������?