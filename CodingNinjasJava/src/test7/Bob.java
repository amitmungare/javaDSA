package test7;

import java.util.Scanner;

public class Bob {
	
	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int l =sc.nextInt();
		
		while(l >0) {
			String s=sc.next();
			int [] fm = new int[26];
			int m = Integer.MIN_VALUE;
			
			for(int i=0; i<26; i++) {
				fm[i]=-1;
			}
			
			for(int i=0; i<s.length(); i++) {
				int j=s.charAt(i)-'a';
				if(fm[j]==-1) {
					fm[j]=i;
				}else {
					int dist = i-fm[j];
					if(dist>m) {
						m=dist;
					}
				}
				
			}
			
			if(m==Integer.MIN_VALUE) {
				System.out.println(-1);
			}else {
				System.out.println(m-1);
			}
			l--;
		}
	}

}
