
public class Package01 {

	public static void main(String[] args) {

		
	}

	private static void pc(int n, int m, int i, int j, int[] w) {

		int[][] v = null;
		for (i = 0; i < n; i++)// i����װ�����Ʒ�������۵���Ʒ��iΪ���٣�������ʣ������Ϊ0��
			v[i][0] = 0;
		for (j = 0; j < m; j++)// j����ʣ��������С��i����Ϊ0����ʾû��װ���κ���Ʒ��
			v[0][j] = 0;
		for (i = 0; i < n; i++)
			for (j = 0; j < m; j++) {
				if (j < w[i])// ʣ������С����Ʒi������
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
