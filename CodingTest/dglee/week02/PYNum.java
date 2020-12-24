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
// split() 메서드를 사용해 주어진 문자열을 한글자씩 쪼개서 배열에 넣고 그 배열을 검사해서 p와 y의 갯수를 세어서 비교했다.
// 대소문자 구분은 하지않아서 그냥 문자열을 다 소문자로 바꿔서 비교했다.