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
// 쉽다....이지해.... 오름차순은 걍 sort한 해도 되는데 내림차순은 처음해보는거같다. 자주 쓸거같으니까 외워야짓