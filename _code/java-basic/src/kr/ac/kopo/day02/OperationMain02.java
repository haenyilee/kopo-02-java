package kr.ac.kopo.day02;

import java.util.Scanner;

public class OperationMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// "������ �Է��ϼ���" ���� ���
		System.out.print("������ �Է��ϼ��� : ");
		
		// Ű����� ���� �Է¹ޱ�
		int num = sc.nextInt();
		
		// ��� ���
		boolean result = (num > 0 && num % 2 == 0); 
		System.out.println(num + "�� ¦�� ���� : " + result);
		
		sc.close();
	}

}
