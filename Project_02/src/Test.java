import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int inputNum = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int inputNum2 = s.nextInt();
		int totalNum = inputNum + inputNum2;
		System.out.println("�Է¹��� �μ��� ���� " + totalNum);
		System.out.printf("�Է¹��� �μ��� ���� %d", totalNum);
	}
}
