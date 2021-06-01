public class PowerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 5;
		long res = 0;
		
		for(int i=1; i<=n; i++) {
			res += power(x, i);
		}
		
		System.out.println(res);
	}
	
	static long power(int x, int n) {
		if(n==1) return x;
		return x * power(x, n-1);
	}
}
