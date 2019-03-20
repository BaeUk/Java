import java.util.Random;
import java.util.Scanner;

public class Edu02 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int randomValue = r.nextInt(100); // r.nextDouble 실수도 생성가능
		int randomValue2 = randomValue % 2;
		
		System.out.println("임의의 값은 : " + randomValue);
		System.out.println("나머지 값은 : " + randomValue2);
		System.out.println("나머지 값은 : " + (randomValue % 2)); // ( )로 가독성
		
		if (randomValue2 == 0) {
			System.out.println("임의의 값은 짝수입니다.");
		} else {
			System.out.println("임의 값은 홀수입니다.");
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		
		int inputNumber = s.nextInt();
		int inputNumber2 = inputNumber % 2;
		
		System.out.printf("입력한 값은 : %d \n", inputNumber);
		System.out.printf("나머지 값은 : %d \n", inputNumber2);
		
		if (inputNumber2 == 0) {
			System.out.println("임의의 값은 짝수입니다.");
		} else {
			System.out.println("임의 값은 홀수입니다.");
		}
		
		int randomNumber = r.nextInt(100);
		
		if (inputNumber > randomNumber) {
			System.out.println("입력한 숫자가  2번째 랜덤숫자보다 높습니다.");
		} else if (inputNumber == randomNumber) {
			System.out.println("입력한 숫자와 2번째 랜덤숫자가 같습니다.");
		} else if (inputNumber < randomNumber) {
			System.out.println("입력한 숫자가  2번째 랜덤숫자보다 낮습니다.");
		}
		System.out.printf("2번째 랜덤숫자는 %d 입니다.", randomNumber);
	}

}