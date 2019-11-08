package concorrente;

public class Matrix implements Runnable{
	
	int A[][] = new int[1000][1000];
	int B[][] = new int[1000][1000];
	int C[][] = new int[1000][1000];
	
	int x;
	
	

	
	Matrix(int A[][], int B[][],int C[][],int x) {
		this.A = A;
		this.B = B;
		this.C = C;
		
		this.x = x;	
	}
	
	
	public void run() {
		for(int j=0; j<1000; j++){
			for(int k=0; k<1000; k++) {
				C[x][k] += A[x][k] * B[k][j]; 
				
				
			}
		}	
	//	
	}
	
	
public static void main(String[] args) {
	
	int A[][] = new int[1000][1000];
	int B[][] = new int[1000][1000];
	int C[][] = new int[1000][1000];
	
	
	
	//
	for(int i=0; i<1000; i++){
		for(int j=0; j<1000; j++) {
			A[i][j] = 1;
			B[i][j] = 1;
			C[i][j] = 0;
			 
		}
	}
	//
	for(int i=0; i<1000; i++) {
		
		Matrix tread1 = new Matrix(A,B,C,i) ;
		Thread t1 = new Thread(tread1);
		t1.start();
			
	}
	//
	for(int i=0; i<1000; i++){
		for(int j=0; j<1000; j++) {
			System.out.println(C[i][j]);
			
		}
	}
	//	
	}
}
