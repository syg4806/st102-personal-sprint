package week_4;

import java.util.*;
public class Star {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int num1=0; num1<b;num1++) {
        	for(int num2=0; num2<a;num2++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }

    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12969
//왜 풀어야하는지 잘 모를 정도....
//근데 평소에 출력할 때 println만 써서 자동으로 줄바꿈 되는거 생각도 못하고 30초동안 얼탔다.
//역시 기본이 중요하다!