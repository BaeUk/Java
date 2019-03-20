
public class QuizFor2 {
	public static void main(String[] args) {
		int totalNumber = 0;
		int number01 = 0;
		int number02 = 0;
		
		for (int i = 0; i < 101; i++) {
			totalNumber = totalNumber + i;
			if (i % 2 ==0) {
				number01 = number01 + i;
			} else if (i % 2 == 1) {
				number02 = number02 + i;
			}
		}
		//number02 = totalNumber - number01;
		System.out.println("1부터 100까지 짝수의 합은" + number01);
		System.out.println("1부터 100까지 홀수의 합은" + number02);
	}
}
