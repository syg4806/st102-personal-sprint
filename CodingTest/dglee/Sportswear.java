package Ang;

public class Sportswear {
	 public int solution(int n, int[] lost, int[] reserve) {
	        int answer = n;
	        int[] student = new int[n+2];
	        for(int i=1; i<=student.length-2;i++) {
	        	student[i]++;
	        	for(int j=0;j<lost.length;j++) {
	        		if(i==lost[j]) student[i]--;
	        	}
	        	for(int j=0;j<reserve.length;j++) {
	        		if(i==reserve[j]) student[i]++;
	        	}
	        }
	        
	        for(int i=1; i<=student.length-2;i++) {
	        	if(student[i]==0) {
	        		if(student[i-1]==2) {
	        			student[i]++;
	        			student[i-1]--;
	        		}
	        		
	        		else if(student[i+1]==2) {
	        			student[i]++;
	        			student[i+1]--;
	        		}
	        		else {
	        			answer--;
	        		}	
	        	}     	
	        }      
	        return answer;
	    }
}
//두 for문의 조건이 같아 합쳐서도 코딩할 수 있을거라 생각해 해봤지만
//막상 합치고 보니 가독성도 안좋고, 코드길이도 별 차이가 없어서 지금처럼 다시 바꿨다.