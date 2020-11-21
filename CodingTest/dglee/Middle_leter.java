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
//굳이 변수 half는 안만들어도 됐지만 다른 사람 보기 편하라고 선언하긴 했는데 줄일 수 있으면 줄이는게 좋을까?
//예전에도 풀었던 문제라 1분컷해버렸다.