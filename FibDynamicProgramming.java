class FibDynamicProgramming{
	public static int fibdynam(int n){
		int[] fibArr = new int[n+1];
		fibArr[0] = 1;
		fibArr[1] = 1;

		for(int x=2; x<n; x++){
			fibArr[x] = fibArr[x-1] + fibArr[x-2];
		}
		return fibArr[n-1] + fibArr[n-2];
	}
	public static void main(String[] args){
		System.out.println(fibdynam(25));
	}
}