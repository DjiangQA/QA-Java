package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spiralRoot(5);
	}
	
	
	static void spiralRoot(int n){
		
		int[] x = new int[n*n];
		int[][] y = new int[n][n];
		
		for(int i = 0; i <= n*n -1; i++){
			x[i] = i+1;
		}
		
		
		int result = 1;
		for(int j = 0; j < n; j++){
			for(int i = 0; i <= (n-1); i++, result++){
				y[i][j] = result;
				//System.out.print(result + ", ");
			}
		}
		
		for(int j = 0; j < n; j++){
			System.out.println();
			for(int i = 0; i <= (n-1); i++, result++){
				System.out.print("\t" + y[i][j]);
			}
		}
	}
}




