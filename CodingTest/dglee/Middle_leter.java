package Ang;
import java.util.*;
public class Middle_leter {
	public String solution(String s) {
		int length = s.length();
		int half = length/2;
		
		if(length%2==0) return s.substring(half-1,half+1);
		return s.substring(half,half+1);
    }
}
//���� ���� half�� �ȸ��� ������ �ٸ� ��� ���� ���϶�� �����ϱ� �ߴµ� ���� �� ������ ���̴°� ������?
//�������� Ǯ���� ������ 1�����ع��ȴ�.