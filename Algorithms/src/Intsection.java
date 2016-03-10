import java.util.Scanner;

public class Intsection {

	/*整数划分算法，将正整数n划分成一系列的整数的和，其中最大加数不大于m*/
	//思想：递归与分治
	//
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数n的值");
		int n = sc.nextInt();
		System.out.println("请输入最大加数的值m");
		int m = sc.nextInt();
		int i = section(n, m);
		System.out.println(i);

	}
	
	public static int section(int n,int m) {
		
		if(m == 1 || n == 1){
			return 1;
		}else if(m < 1 || n < 1){
			return 0;
		}else if(n < m){
			return section(n,n);
		}else if(n == m){
			return 1 + section(n,n-1);//1代表的是n=n情况
		}else return section(n, m-1) + section(n-m, m);
				//n>m的情况，这种情况可以分为上述俩种情况的总和，section(n,m-1)保留了n不变
				//section(n-m,m)保留了m不变，进行递归
		
	}

}
