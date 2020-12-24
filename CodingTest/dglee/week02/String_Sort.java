package week_2;
import java.util.*;
public class String_Sort {

	public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        for(int i=0; i<strings.length;i++) {
        	strings[i] = strings[i].substring(n, n+1) + strings[i];
        }
        
        Arrays.sort(strings);
        answer = new String[strings.length];
        
        for(int i=0; i<strings.length;i++) {
        	answer[i] = strings[i].substring(1);
        }
        return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12915
//�K�� ������. ó���� n��° �ε����鳢���� ��Ƽ� �迭�� �ְ�
//sort�ؼ� �� �ε��� ������ �� �迭�� �����ؼ� �ߴµ�, ����ó���Ұ͵� �ʹ� ���� ��������� ��� �����ߴ�.
//�׷��ٰ� �׳� n��° ���� �������� �����ϴ°Ŵϱ� �긦 ���ڷ� ���� strings�迭�� ���� �߰����༭ �ߴ�.
//�׷��� n��° ���ڰ� ������ �ڿ� ���ڵ� �켱���� ����ؼ� �����ϴϱ� ��������.
//�λ���...�ļ���...