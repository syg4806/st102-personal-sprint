package ex1;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12904

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        String temp;
        for(int i =1;i<s.length()-1;i++) {
        	temp = s.substring(0,i-1);
        	int count = 0;
        	for(int j = 0; j < i; j++) {
        		if(temp.charAt(j)==temp.charAt(i-j))
        			count++;
        		else
        			break;
        	}
        	if(count == i)
        		answer = i;
        	
        }

        return answer;
    }
}
public class ex2 {

	public static void main(String[] args) {
		System.out.println(5/2);
		

	}

}
