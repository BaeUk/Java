import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��� �ּ���.");
		int inputNum1 = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���.");
		int inputNum2 = s.nextInt();
	
		int sumNum = inputNum1 + inputNum2;
		System.out.printf("%d�� %d�� ���� %d�Դϴ�.", inputNum1, inputNum2, sumNum);
	}
}