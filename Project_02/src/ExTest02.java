import java.util.Scanner;

public class ExTest02 {
	public static void main(String[] args) {	
		System.out.println("ȭ�鿡 ���ڸ� �Է��� �ּ���");
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.print("�Է��� ���ڴ� ");
		System.out.println(inputNumber);
		
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���");
		int inputNumber2 = s.nextInt();
		System.out.print("�ι� �Է��� ���ڴ� ");
		System.out.println(inputNumber2);
		
		int num1 = inputNumber + 10;
		int num2 = inputNumber * inputNumber2;
		
		System.out.println("ù��° �Է� ���� ���� + 10 = " + num1);
		System.out.println("�Է� ���� �� ���� ���� " + num2);
		
		System.out.printf("ù��° �Է¹��� ���� +10 ��  %d�Դϴ�", num1);
	}
}