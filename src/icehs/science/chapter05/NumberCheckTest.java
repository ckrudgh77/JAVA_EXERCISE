package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 3;
		int number2 = -3;
		int result = number1 * number2;
		
		if (result >= 0) {
			System.out.println(number1 + " * " + number2 + " : �� �ڸ� ���Դϴ�.");
		}else if (result >= 10) {
			System.out.println(number1 + " * " + number2 + " : �� �ڸ� ���Դϴ�.");
		}else if (result >= 100) {
			System.out.println(number1 + " * " + number2 + " : �� �ڸ� �� �̻��Դϴ�.");
		}else {
			System.out.println(number1 + " * " + number2 + " : ������ Ȯ������ �ʽ��ϴ�.");
		}
		
	}

}