package week_3;
import java.util.*;
public class Caesar {

	public String solution(String s, int n) {
		String answer="";
    
        for(int i=0; i<s.length();i++) {
        	int caesar =s.charAt(i)+n;
        	if((s.charAt(i))==32)
        		answer+=" ";
        	else {
        		if(!((s.charAt(i)<91&&caesar<91)||(s.charAt(i)>96&&caesar<123)))
        			caesar = caesar-26;
        			
        		answer +=String.valueOf((char)(caesar));
        	}         	
        }        
        return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12926
//�ƽ�Ű �ڵ带 ���°Ŷ� ���� ��� ��������.
//���ǹ��� ��� �ϴ����� ���� �׽�Ʈ ���̽� ������� �� �޶��µ�
//������ �����߾���(else�� if�� 3��������)�ڵ带 ������ �ϸ鼭 �����ϰ� ����� �� ��Ȯ�ϰ� �Ǿ���.