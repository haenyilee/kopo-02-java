package kr.ac.kopo.day02;

public class ConstMain {
	public static void main(String[] args) {
		
		char ch = 'A';
		ch = 65; 
		ch = '\u0041'; // �����ڵ� 65�� ���ڸ� ch�� ���� (16���� ���·� ǥ��)
		System.out.println(ch);
		
		int code = ch;
		System.out.println(code);
		
		// char�� �������� �˰�ʹٸ�? ����ȯ�� �ϸ� �ȴ�. 
		System.out.println((int)ch);
		
	}
}
