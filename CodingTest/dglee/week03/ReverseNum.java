package week_3;
public class ReverseNum {

	public int[] solution(long n) {
		int length = String.valueOf(n).length();
		int[] answer = new int[length];
		String[] strarr = String.valueOf(n).split("");
      
		for (int i=0; i <length; i++) {
			answer[i] = Integer.parseInt(strarr[length-1-i]);
		}
		
		return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12932
//처음에는 10으로 나누기랑 나머지 연산을 통해서 했는데 3개의 테스트케이스가 통과되지 못했다.
//그래서 위와 같이 n을 문자열로 변환하고 쪼갠뒤 int형 배열에 형변환을 통해 뒤집어 넣어주었다.
//확실히 형변환하는건 자주 사용되기 때문에 자주 쓰이는것들은 외워두는게 좋을거 같다.