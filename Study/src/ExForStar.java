
public class ExForStar {
	public static void main(String[] args) {
	for(int i=0; i<5; i++) {
		for(int j=i; j<5; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=0; i<5; i++) {
		for(int j=0; j<i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			if(i+j < 4){
				System.out.print("+");
			}else{
				System.out.print("*");
			}
		}
		System.out.println();
	}
	for(int i=0; i<5; i++) {
		for(int j=0; j<4-i; j++) {
			System.out.print(" ");
		}
		for(int j=0; j<2*i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	 for (int i = 0; i < 5; i++) {
         for (int j = 0; j < (5+i); j++) { 
        	 if (j < 4 - i ) {
        		 System.out.print(" ");
        	 } else {
        		 System.out.print("*");
        	 }
         }
         System.out.println();
 		}
	 
	 for (int i = 0; i < 5; i++) {
         for (int j = 0; j < (9-i); j++) { 
        	 if (j < i ) {
        		 System.out.print(" ");
        	 } else {
        		 System.out.print("*");
        	 }
         }
         System.out.println();
 		}

	}
}
