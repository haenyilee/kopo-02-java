package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * q. �����ϴ� ������ �Է��ϼ���
 * a. ���� 3~5���Դϴ�.
 * 
 */



public class SwitchMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϴ� ������ �Է��ϼ��� : ");
		String season = sc.nextLine();
		System.out.println();
		
		switch(season) {
		case "spring" :
		case "SPRING" :
		case "��" :
			System.out.println("���� 3~5������ �Դϴ�.");
		
		case "summer" :
		case "SUMMER" :
		case "����" :
		}
	}

}
