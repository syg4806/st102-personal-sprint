package week_2;
import java.util.*;
public class String_Descend {

	public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        Arrays.sort(strArr,Collections.reverseOrder());
        for(String i : strArr)
        	answer += i;
        return answer;
    }
}
// https://programmers.co.kr/learn/courses/30/lessons/12917
// ����....������.... ���������� �� sort�� �ص� �Ǵµ� ���������� ó���غ��°Ű���. ���� ���Ű����ϱ� �ܿ�����