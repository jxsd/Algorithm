import java.util.Scanner;

public class BinarySearch {
	
	/*��һ���ź������������ͨ�����ֲ����ҵ�����x���������λ�ã��������λ�ã�û������ޡ�*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("����������Ĵ�Сn");
		int n = sc.nextInt();
		System.out.println("����������Ҫ�ҵ���");
		int x = sc.nextInt();
		int [] a = new int [n];
		for(int k = 0;k < a.length;k++){
			a[k] = k;
		}
		int i = search(a, x, n);
		if(i == -1){
			System.out.println("û�������");
		}else{
			System.out.println("�����������ĵ�" + i + "��λ��");
		}

	}
	
	
	private static int search(int [] a ,int x,int n ) {
		int left = 0;
		int right = n-1;
		while(left <= right){
			int middle = (left + right)/2;
			if(x == a[middle]){
				return middle;
			}else if(x > a[middle]){
				left = middle + 1;
			}else {
				right = middle - 1;
			}
		}
		return -1;
		
	}

}
