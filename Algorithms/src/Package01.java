
public class Package01 {

	public static void main(String[] args) {

		
	}

	private static void pc(int n, int m, int i, int j, int[] w) {

		int[][] v = null;
		for (i = 0; i < n; i++)// i代表装入的物品数，无论的物品数i为多少，背包的剩余容量为0；
			v[i][0] = 0;
		for (j = 0; j < m; j++)// j代表剩余容量大小，i总是为0，表示没有装入任何物品。
			v[0][j] = 0;
		for (i = 0; i < n; i++)
			for (j = 0; j < m; j++) {
				if (j < w[i])// 剩余容量小于物品i的重量
					v[i][j] = v[i - 1][j];
				else{
					
				}

			}

	}


	private static int max(int a,int b) {

		if(a>=b)
			return a;
		else return b;
	}

}
