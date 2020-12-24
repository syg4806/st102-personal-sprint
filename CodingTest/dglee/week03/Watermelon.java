package week_3;
import java.util.*;
public class Watermelon {
	 public String solution(int n) {
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i=0;i<n/2;i++)
        		sb.append("수박");
	       
	        if(n%2==1){
	        	sb.append("수");
	        }
	        return sb.toString();
	    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12922
//StringBuilder랑 그냥 문자열 String을 아무렇게나 쓰긴 하는데
//보통 어떤 상황에선 어떤걸 쓰는게 좋을까?