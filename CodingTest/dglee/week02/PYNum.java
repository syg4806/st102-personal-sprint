package week_2;

public class PYNum {

	boolean solution(String s) {
        boolean answer = true;
        int pnum=0;
        int ynum=0;
        String[] strArr = s.split("");
        for(String i : strArr) {
        	if(i.toLowerCase().equals("p"))
        		pnum++;
        	else if(i.toLowerCase().equals("y"))
        		ynum++;
        }
        if(pnum != ynum)
        	answer =false;

        return answer;
    }
}
// https://programmers.co.kr/learn/courses/30/lessons/12916
// split() �޼��带 ����� �־��� ���ڿ��� �ѱ��ھ� �ɰ��� �迭�� �ְ� �� �迭�� �˻��ؼ� p�� y�� ������ ��� ���ߴ�.
// ��ҹ��� ������ �����ʾƼ� �׳� ���ڿ��� �� �ҹ��ڷ� �ٲ㼭 ���ߴ�.