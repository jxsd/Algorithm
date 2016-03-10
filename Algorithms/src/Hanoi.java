import java.util.Scanner;

public class Hanoi {

	/*把n个块从a借助c移动到b*/
	public static void main(String[] args) {
		// 1代表a,2代表b,3代表c
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入层数n");
		int n=sc.nextInt();
		Hanota(n,1,2,3);

	}
	
	public static void Hanota(int n,int a,int b,int c) {
		//思想：递归，
		//汉洛塔问题就是当前面的n-1放好以后再方n
		//定义函数把n个圈从a借助c移动到b,
		if(n > 0){
			Hanota(n-1, a, c, b);//把n-1借助b从a移动到c
			move(a,b);//把a移动到b
			Hanota(n-1, c, b, a);//把n-1借助a从c移动到b
		}
		
	}
	
	public static void move(int m,int n) {
		System.out.println(m + "->" +n);
		
	}

}
