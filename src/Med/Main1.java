package Med;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new  Scanner(System.in);
		System.out.println (" please enter your first number " ); 
		int A = sc.nextInt();
		System.out.println (" please enter your operation sign " );
		String C = sc.next();
		System.out.println (" please enter your seconde number " );
		int B = sc.nextInt();
	
	
		if (C.equals("+")){
			System.out.println (A+B );
		}
	 else if (C.equals("-")) {
		 System.out.println (A-B );
	} else if (C.equals("*")) {
		 System.out.println (A*B );
	} else if (C.equals("/")) {
		 System.out.println (A/B );
	} else  {
		 System.out.println ("your operation signe is wrong" );
	}
	
	
	
	
	}
}

	
