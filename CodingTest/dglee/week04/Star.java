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
//�� Ǯ����ϴ��� �� �� ����....
//�ٵ� ��ҿ� ����� �� println�� �Ἥ �ڵ����� �ٹٲ� �Ǵ°� ������ ���ϰ� 30�ʵ��� ������.
//���� �⺻�� �߿��ϴ�!