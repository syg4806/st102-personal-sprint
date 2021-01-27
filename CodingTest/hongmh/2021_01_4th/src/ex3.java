
//문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12933
/*
 * 다른 사람 풀이를 보니 굳이 반복문을 쓰지 않더라도
 * StringBuilder sb = new StringBuilder(new String(c,0,c.length));
 * 이런식으로 배열에 있는 문자열로 문자를 바로 생성 할 수 있다는 좋은 사실을 알게됨.
 * 아 혹시 스트링빌더 실제로 많이 사용되는지?? 중요도가 얼마나 되는지좀 알려주세요!!
 */
  

import java.util.Arrays;


class Solution {
    public long solution(long n) {
        String answer = "";
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for(int i = arr.length-1; i>=0;i--)
        	answer+=arr[i];
        
        
        return Long.parseLong(answer);
    }
}

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
