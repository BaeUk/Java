import java.util.Random;
import java.util.Scanner;

public class QuizDice {
	public static void main(String[] args) {
		Random r = new Random();
	    Scanner s = new Scanner(System.in);
		
		System.out.println("화면에 주사위를 굴릴까요? 시작하려면 Enter");
		
		String userAnswer = s.nextLine(); // 문자열 입력
		for (int i = 0; i < 1000; i++) {
			if (userAnswer.equals("")) {
				break;
			}
			System.out.println("화면에 주사위를 굴릴까요? 시작하려면 Enter");
			userAnswer = s.nextLine();
		}
			
		int userDice = r.nextInt(6) + 1;
		System.out.println("당신의 주사위는 " + userDice + "이 나왔습니다.");
		
		System.out.println("컴퓨터가 주사위를 굴립까요? 시작하려면 Enter");
		String comAnswer = s.nextLine(); // 문자열 입력
		for (int i = 0; i < 1000; i++) {
			if (comAnswer.equals("")) {
				break;
			}
			System.out.println("컴퓨터가 주사위를 굴립까요? 시작하려면 Enter");
			comAnswer = s.nextLine();
		}
		
		int comDice = r.nextInt(6) + 1;
		System.out.println("컴퓨터의 주사위는 " + comDice + "이 나왔습니다.");
		
		if (userDice > comDice) {
			System.out.println("You Win");
		} else if (userDice == comDice) {
			System.out.println("Draw");
		} else if(userDice < comDice) {
			System.out.println("You Lose");
		} else {
			System.out.println("에러???");
		}
		
	}
}
