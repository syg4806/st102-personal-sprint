package week_4;

public class MCMCM {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = n<m ? n : m;
        int big = n>m ? n : m;
        
        for(;min>0;min--) {
        	if(n%min==0&&m%min==0) {
        		answer[0] = min;
        		break;
        	}      		
        }
        
        for(;;big++) {
        	if(big%n==0&&big%m==0) {
        		answer[1] = big;
        		break;
        	}      		
        }
        
        return answer;
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12940
//최대공약수, 최대공배수 구하는 문제였는데 쉬웠다!
//코드 줄 수를 더 줄여보려고 했는데 그럼 너무 가독성이 안좋아져서 지금 형태로 유지했다.