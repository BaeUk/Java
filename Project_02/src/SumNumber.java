import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해 주세요.");
		int inputNum1 = s.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요.");
		int inputNum2 = s.nextInt();
	
		int sumNum = inputNum1 + inputNum2;
		System.out.printf("%d와 %d의 합은 %d입니다.", inputNum1, inputNum2, sumNum);
	}
}