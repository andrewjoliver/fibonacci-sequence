import java.lang.Math;

class FibBinet{
	public static int fibBinet(int n){
		n = n+1;
		double sqrt5 = Math.sqrt(5);
		double firstExpBase = (1+sqrt5) / 2;
		double secondExpBase = (1-sqrt5) / 2;
		double firstExp = Math.pow(firstExpBase, n);
		double secondExp = Math.pow(secondExpBase, n);

		double fibN = (1/sqrt5) * (firstExp - secondExp);
		int fibNFinal = (int) fibN;
		return fibNFinal;
	}
	public static void main(String[] args){
		System.out.println(fibBinet(25));
	}
}