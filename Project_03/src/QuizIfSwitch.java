import java.util.Random;

public class QuizIfSwitch {
	public static void main(String[] args) {
		Random r = new Random();
		int randomValue = r.nextInt(6) + 1;
		// randomValue = randomValue % 6 + 1; 
		// 제약을 이용해 숫자가 넘어가는것을 방지 꼭필요한건 아님
		
		System.out.println("주사위의 숫자는 " + randomValue);
		
		if (randomValue > 2) {
			System.out.println(randomValue);
		}  else if (randomValue == 2) {
			System.out.println("야옹");
		} else if (randomValue == 1) {
			System.out.println("멍멍");
		}
		
		switch (randomValue) {
		case 1:
			System.out.println("멍멍");
			break;
		case 2:
			System.out.println("야옹");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		}
	}
}
