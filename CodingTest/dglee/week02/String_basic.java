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
// try-catch�� ���� �����غ��� ���۸��ϸ鼭 ����ߴµ� ����...��ճ�...������ ������..
// �� Ǯ�������ϱ� �߰�ȣ ���Ƽ� ������ ���δ�. ��  try-catch�� �κ� �޼ҵ�ȭ ��Ű�°� ������?