import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int inputNum = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int inputNum2 = s.nextInt();
		int totalNum = inputNum + inputNum2;
		System.out.println("입력받은 두수의 합은 " + totalNum);
		System.out.printf("입력받은 두수의 합은 %d", totalNum);
	}
}
