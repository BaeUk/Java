// 가위 0 바위 1 보 2
// answer.equals("y") answer랑 y 문자열 비교 

import java.util.Random;
import java.util.Scanner;

public class QuizIf {
	public static void main(String[] args) {
		
		Random r = new Random();
	    Scanner s = new Scanner(System.in);
	    
		int randomValue = 0;
		int inputValue = 0;
	    
		System.out.println("컴퓨터와 가위바위보를 하시겠습니다? Y/N");
		String answer = s.nextLine(); // 문자열 입력
		
		while (true) {
			if (answer.equals("y")) {
				System.out.println("가위는 0 바위는 1 보는 2를 입력해주세요.");
				inputValue = s.nextInt();
				
				while (true) {
					if ((inputValue == 0) || (inputValue == 1) || (inputValue == 2)) {
						break;
					} else {
						System.out.println("0~2사이의 숫자를 입력해주세요 ex)0:가위 1:바위 2:보");
						inputValue = s.nextInt();
					}
				}
				
				randomValue = r.nextInt(3);
				
				if ((inputValue - randomValue == 1) || (inputValue - randomValue == -2)) {
					System.out.printf("사용자는 %d 컴퓨터는 %d You Win \n", inputValue, randomValue);
				} else if (inputValue == randomValue ) {
					System.out.printf("사용자는 %d 컴퓨터는 %d Draw \n", inputValue, randomValue);;
				} else {
					System.out.printf("사용자는 %d 컴퓨터는 %d You Lose \n", inputValue, randomValue);
				}
				break;			
			} else if (answer.equals("n")) {
				System.out.println("가위바위보 게임을 종료합니다.");
				break;
			} else {
				System.out.println("입력은 Y 나 N 으로 해주세요.");	
				answer = s.nextLine();
			}
		}
	}
}