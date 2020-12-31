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
//int형 배열의 경우에는 모든 값을 초기화할수 있는데
//String형 배열은 그런게 없어서 for문을 하나 활용하여 null값이 들어가지 않도록 했다.
//정수를 이진수 문자열로 변환하고 split으로 쪼개 각각의 배열에 넣어 비교해주었고
//코드가 너무 복잡해져서 이진화하는 작업은 메소드를 하나 만들었다.