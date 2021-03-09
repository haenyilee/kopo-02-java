package kr.ac.kopo.day02;

public class IFMain01 {

	public static void main(String[] args) {

		int a = 5, b = 5;
		
		/*
		 * 1. 2���� ��� ǥ���ϱ�
		 * 
		 * 	a�� ũ�� a��, �׷��� ������ b�� ����϶�
		 */
		
		// 3�� ������
		System.out.println("MAX : " + (a > b ? a : b));

		// if ~ else ��
		if (a > b) {
			System.out.println("MAX : " + a);
		} else {
			System.out.println("MAX : " + b);
		}
		
		/*
		 * 2. 3���� ��� ǥ���ϱ�
		 * 
		 * 	a�� b���� ũ�� a ���
		 * 	a�� b���� ������ b ���
		 * 	a�� b�� ���ٸ� 0 ���
		 */
		
		// 3�׿�����
		System.out.println(a>b? a: a<b ? b : 0);
		
		// ��ø�� if~ else
		if(a>b) {
			System.out.println(a);
		} else { // a<=b
			if(a<b) {
				System.out.println(b);
			}
			else { // a == b
				System.out.println(0);
			}
		}

		// else if
		if(a>b) {
			System.out.println(a);
		} else if(a<b) {
			System.out.println(b);
		}
		else { // a == b
			System.out.println(0);
		}
		
	}

}
