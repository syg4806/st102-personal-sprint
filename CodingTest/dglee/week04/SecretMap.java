package week_4;

public class SecretMap {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];
        
        for(int i=0; i<n;i++) {
        	answer[i] = "";
        }
        
        for(int num1=0; num1<n; num1++) {
        	binaryArr1 =Binary(arr1[num1],n).split("");
        	binaryArr2 =Binary(arr2[num1],n).split("");
        	for(int num2=0;num2<n;num2++) {
        		if(binaryArr1[num2].equals("1") ||binaryArr2[num2].equals("1") ) {
        			answer[num1] += "#";
        		}
        		else {
        			answer[num1] += " ";
        		}		
        	}
        }

        return answer;
    }
	
	public String Binary(int num, int n) {
		String binary =Integer.toBinaryString(num);
		String output ="";
		for(int i=0; i<n-binary.length(); i++) {
			output +="0";
		}
		return output + binary;
	}

}

//https://programmers.co.kr/learn/courses/30/lessons/17681
//int�� �迭�� ��쿡�� ��� ���� �ʱ�ȭ�Ҽ� �ִµ�
//String�� �迭�� �׷��� ��� for���� �ϳ� Ȱ���Ͽ� null���� ���� �ʵ��� �ߴ�.
//������ ������ ���ڿ��� ��ȯ�ϰ� split���� �ɰ� ������ �迭�� �־� �����־���
//�ڵ尡 �ʹ� ���������� ����ȭ�ϴ� �۾��� �޼ҵ带 �ϳ� �������.