import java.util.Scanner;

public class Intsection {

	/*���������㷨����������n���ֳ�һϵ�е������ĺͣ�����������������m*/
	//˼�룺�ݹ������
	//
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("����������n��ֵ");
		int n = sc.nextInt();
		System.out.println("��������������ֵm");
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
			return 1 + section(n,n-1);//1�������n=n���
		}else return section(n, m-1) + section(n-m, m);
				//n>m�����������������Է�Ϊ��������������ܺͣ�section(n,m-1)������n����
				//section(n-m,m)������m���䣬���еݹ�
		
	}

}
