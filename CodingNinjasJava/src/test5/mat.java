package test5;

import java.util.Scanner;

public class mat {
	
	int [][] m;
	
	mat(int [][] mat){
		m=mat;
	}
		
	
	    public static mat add(mat a,mat b){
	    	
	    	int x=a.m.length;
	    	int y=a.m[0].length;
	    	
	    	int op[][] = new int[x][y];
	    	
	    	for(int i=0; i<x; i++) {
	    		for(int j=0; j<y; j++) {
	    			op[i][j]=a.m[i][j]+b.m[i][j];
	    		}
	    	}
	    	
	    	mat ans = new mat(op);
	    	
	      return ans;
	    }
	    public static mat multiply(mat a,mat b){

	    	int x=a.m.length;
	    	int y=a.m[0].length;
	    	
	    	int op[][] = new int[x][y];
	    	
	    	for(int i=0; i<x; i++) {
	    		for(int j=0; j<y; j++) {
	    			op[i][j]=a.m[i][j]*b.m[i][j];
	    		}
	    	}
	    	
	    	mat ans = new mat(op);
	    	
	      return ans;
	    }
	    public static mat transpose(mat m){
	    	

	    	int x=m.m.length;
	    	int y=m.m[0].length;
	    	
	    	int op[][] = new int[x][y];
	    	
	    	for(int i=0; i<x; i++) {
	    		for(int j=0; j<y; j++) {
	    			op[i][j]=m.m[j][i];
	    		}
	    	}
	    	
	    	mat ans = new mat(op);
	    	
	      return ans;
	    	
	    }
	    public static mat rotate(mat m){
	    	
	    	int x=m.m.length;
	    	int y=m.m[0].length;
	    	
	    	int op[][] = new int[x][y];
	    	
	    	for(int i=0; i<x; i++) {
	    		for(int j=0; j<y; j++) {
	    			op[y-j-1][i]=m.m[i][j];
	    		}
	    	}
	    	
	    	mat ans = new mat(op);
	    	
	      return ans;
	    }
	    public  void print(){
	        for(int i=0;i<m.length;i++)
	        {
	            for(int j=0;j<m[0].length;j++)
	            {
	                System.out.print(m[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	    
	  public static void main(String[] args) {
		
		  
	  }  
	 

}
