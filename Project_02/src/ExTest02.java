import java.util.Scanner;

public class ExTest02 {
	public static void main(String[] args) {	
		System.out.println("화면에 숫자를 입력해 주세요");
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.print("입력한 숫자는 ");
		System.out.println(inputNumber);
		
		System.out.println("두번째 숫자를 입력해 주세요");
		int inputNumber2 = s.nextInt();
		System.out.print("두번 입력한 숫자는 ");
		System.out.println(inputNumber2);
		
		int num1 = inputNumber + 10;
		int num2 = inputNumber * inputNumber2;
		
		System.out.println("첫번째 입력 받은 숫자 + 10 = " + num1);
		System.out.println("입력 받은 두 수의 곱은 " + num2);
		
		System.out.printf("첫번째 입력받은 숫자 +10 은  %d입니다", num1);
	}
}