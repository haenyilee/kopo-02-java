package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 1���� 3 ������ ���ڸ� �Է¹ޱ�
 * 
 * �Է¹��� ������ ����ǥ�� ����ϱ�
 * 
 * ������ �ʰ��ϸ� error ��¹ޱ�
 * */

public class SwitchMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - 3 ������ ���� : ");
		int num = sc.nextInt();
		
		// if ~ else��
		if(num == 1) {
			System.out.println("ONE");
		} else if(num == 2) {
			System.out.println("TWO");
		} else if(num == 3) {
			System.out.println("THREE");
		} else {
		System.out.println("ERROR");
		}
		
		// switch��
		switch(num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		default :
			System.out.println("ERROR");
		case 3:
			System.out.println("THREE");
			break;
		}
			
		
	}

}
