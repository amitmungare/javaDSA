package treeG;

import java.util.Scanner;

public class Atm {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		int notes;

		sc = new Scanner(System.in);
		    

		int n = sc.nextInt();
			
		if(n>25000){
			System.out.print(-1);
			return;
		}
		
		int choice=0;
		
		if(n%100 != 0) {
			System.out.println(-1);
			return;
		}else {
			choice = sc.nextInt();
		}
		
		if(choice > n) {
			System.out.println(-1);
			return;
		}
			
				 
		switch(choice){
		
			default:
				System.out.println(-1);
		        break;
		        
			case 2000:
				notes=n/2000;
		        System.out.println(notes);
		        n=n%2000;
		        
			case 500:
			    notes=n/500;
			    System.out.println(notes);
			    n=n%500;
			
			case 200:
			    notes=n/200;
			    System.out.println(notes);
			    n=n%200;
		        
			case 100:
			    notes=n/100;
			    System.out.println(notes);
			    n=n%100;
		}
	}
}

