package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs {
	
	public static void dfs(int mat[][]) {
		boolean v[] = new boolean[mat.length];
		
		for(int i=0; i<mat.length; i++) {
			if(!v[i]) {
				dfs(mat,i, v);
			}
		}
		
		
	}
	
	public static void dfs(int mat[][], int curr, boolean v[]) {
		
		v[curr]=true;
		System.out.print(curr+" ");
		for(int i=0; i<mat.length; i++) {
			if(mat[curr][i] ==1 && v[i]==false) {
				dfs(mat, i,v);
			}
		}
	}
	
	public static void bfs(int mat[][]) {
		Queue<Integer> pv = new LinkedList<Integer>();
		boolean v[] = new boolean[mat.length];
		v[0]=true;
		pv.add(0);
		
		while(!pv.isEmpty()) {
			int currvertex = pv.poll();
			System.out.print(currvertex+" ");
			for(int i=0; i<mat.length; i++) {
				if(mat[currvertex][i] ==1 && ! v[i]) {
					pv.add(i);
					v[i]=true;
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		int mat[][] = new int[n][n];
		
		for(int i=0; i<e; i++) {
			int v1 =sc.nextInt();
			int v2 =sc.nextInt();
			mat[v1][v2]=1;
			mat[v2][v1]=1;
		}
		dfs(mat);
//		bfs(mat);
	}

}
