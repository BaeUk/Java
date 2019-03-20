// 점수를 입력받아서 총점과 평균 계산

import java.util.Arrays;
import java.util.Scanner;

public class QuizFor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int totalScore = 0;
		int stuNumber = 0;
		System.out.print("점수를 입력할 학생의 수 : ");
		stuNumber = s.nextInt();
		int[] stuScore = new int[stuNumber]; // 배열 생성
		
		for(int i = 0; i < stuNumber; i++) {
			System.out.print((i + 1) + "번째 학생의 점수 : ");
			stuScore[i] = s.nextInt();
			totalScore = totalScore + stuScore[i];
		}
		double average = (double)totalScore / stuNumber; // 나누기 할때 double 형변환!!!
			
		System.out.println("점수를 입력한 학생 " + stuNumber + "명");
		System.out.println("총점 : " + totalScore);
		System.out.println("평균은 : " + average);
//		System.out.println("평균은: " + Math.round(average * 100) / 100);
		System.out.printf("평균은: %4.2f \n", average);
		System.out.println(Arrays.toString(stuScore)); // 배열에 입력된 값 출력
		System.out.println(stuScore[2]);
		Arrays.sort(stuScore);
		System.out.println(Arrays.toString(stuScore));
		System.out.println(stuScore[2]);
	}
}