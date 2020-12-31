package week_4;

public class Average {
	public double solution(int[] arr) {
        double answer = 0;
        for(double num : arr) {
        	answer +=num;
        }
        return answer/arr.length;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12944
// 이제는 그저 귀엽다.... 
// 가독성이 떨이지지 않는 선에서는 코드 줄 수를 줄이기 위해 return할때 연산을 같이 하고 있다.