import java.util.Scanner;

public class ExFor2_Star {
	public static void main(String[] args) {
		System.out.println("홀수를 입력해 주세요");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for (int i=0; i<num; i++) {
		       for (int j=0; j<num+i; j++) {
		    	   if (j < num-1-i) {
		    		   System.out.print(" ");
		    	   } else {System.out.print("*"); 
		    	   }
		        } 
		        System.out.println();

		}
	}
}
