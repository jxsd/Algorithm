import java.util.Scanner;

public class Hanoi {

	/*��n�����a����c�ƶ���b*/
	public static void main(String[] args) {
		// 1����a,2����b,3����c
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("���������n");
		int n=sc.nextInt();
		Hanota(n,1,2,3);

	}
	
	public static void Hanota(int n,int a,int b,int c) {
		//˼�룺�ݹ飬
		//������������ǵ�ǰ���n-1�ź��Ժ��ٷ�n
		//���庯����n��Ȧ��a����c�ƶ���b,
		if(n > 0){
			Hanota(n-1, a, c, b);//��n-1����b��a�ƶ���c
			move(a,b);//��a�ƶ���b
			Hanota(n-1, c, b, a);//��n-1����a��c�ƶ���b
		}
		
	}
	
	public static void move(int m,int n) {
		System.out.println(m + "->" +n);
		
	}

}
