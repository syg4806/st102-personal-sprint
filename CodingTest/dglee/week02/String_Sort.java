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
//줜나 빡세다. 처음에 n번째 인덱스들끼리만 모아서 배열에 넣고
//sort해서 그 인덱스 순서를 또 배열에 저장해서 했는데, 예외처리할것도 너무 많고 결과적으로 계속 실패했다.
//그러다가 그냥 n번째 문자 기준으로 정렬하는거니까 얘를 인자로 받은 strings배열에 각각 추가해줘서 했다.
//그러면 n번째 문자가 같더라도 뒤에 문자들 우선순위 고려해서 정렬하니까 편해졌다.
//인생은...꼼수다...