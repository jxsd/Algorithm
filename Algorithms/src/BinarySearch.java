import java.util.Scanner;

public class BinarySearch {
	
	/*把一个排好序的数组序列通过二分查找找到整数x在数组里的位置，有则输出位置，没有输出无。*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组的大小n");
		int n = sc.nextInt();
		System.out.println("请输入你需要找的数");
		int x = sc.nextInt();
		int [] a = new int [n];
		for(int k = 0;k < a.length;k++){
			a[k] = k;
		}
		int i = search(a, x, n);
		if(i == -1){
			System.out.println("没有这个数");
		}else{
			System.out.println("这个数在数组的第" + i + "个位置");
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
