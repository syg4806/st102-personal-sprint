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
//�� for���� ������ ���� ���ļ��� �ڵ��� �� �����Ŷ� ������ �غ�����
//���� ��ġ�� ���� �������� ������, �ڵ���̵� �� ���̰� ��� ����ó�� �ٽ� �ٲ��.