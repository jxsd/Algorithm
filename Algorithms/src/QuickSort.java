
public class QuickSort {

	public static void main(String[] args) {
		//快速排序是对气泡排序的一种改进方法,快速排序具有不稳定性。
		//思想：递归
		/*
		 * 把整个序列看做一个数组，把第零个位置看做中轴，和最后一个比，如果比它小交换，比它大不做任何处理；交换了以后再和小的那端比，比它小不交换，
		 * 比他大交换。这样循环往复，一趟排序完成，左边就是比中轴小的，右边就是比中轴大的，然后再用分治法，分别对这两个独立的数组进行快速排序。
		 * 直到子序列只剩一个数
		 */
		
		
		
		/*
		 * 例如：待排序的数组A的值分别是：（初始关键数据X：=49）
		 * 
		 * A[1] A[2] A[3] A[4] A[5] A[6] A[7]：
		 * 
		 * 49 38 65 97 76 13 27
		 * 
		 * 进行第一次交换后： 27 38 65 97 76 13 49
		 * 
		 * ( 按照算法的第三步从后面开始找)
		 * 
		 * 进行第二次交换后： 27 38 49 97 76 13 65
		 * 
		 * ( 按照算法的第四步从前面开始找>X的值，65>49,两者交换，此时I：=3 )
		 * 
		 * 进行第三次交换后： 27 38 13 97 76 49 65
		 * 
		 * ( 按照算法的第五步将又一次执行算法的第三步从后开始找)
		 * 
		 * 进行第四次交换后： 27 38 13 49 76 97 65
		 * 
		 * ( 按照算法的第四步从前面开始找大于X的值，97>49,两者交换，此时J：=4
		 * 此时再执行第三步的时候就发现I=J，从而结束一躺快速排序，那么经过一躺快速排序之后的结果是：27 38 13 49 76 97
		 * 65，即所以大于49的数全部在49的后面，所以小于49的数全部在49的前面。
		 * 
		 * 快速排序就是递归调用此过程——在以49为中点分割这个数据序列，分别对前面一部分和后面一部分进行类似的快速排序，
		 * 从而完成全部数据序列的快速排序，最后把此数据序列变成一个有序的序列，根据这种思想对于上述数组A的快速排序的全过程如图6所示：
		 * 
		 * 初始状态 {49 38 65 97 76 13 27}
		 * 
		 * 进行一次快速排序之后划分为 {27 38 13} 49 {76 97 65}
		 * 
		 * 分别对前后两部分进行快速排序 {13} 27 {38}
		 * 
		 * 结束 结束 {49 65} 76 {97}
		 * 
		 * 49 {65} 结束
		 * 
		 * 结束
		 */
		int [] a = new int [] {4,3,6,1,2,5,8,7,9};
		quick_sort(a, 0, 8);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	
	static void quick_sort(int s[], int low, int high)  
	{  
	    if (low < high)  
	    {  
	        int i = getmiddle(s, low, high);//先成挖坑填数法调整s[] 得到中值 
	        quick_sort(s, low, i - 1); // 递归调用   
	        quick_sort(s, i + 1, high);  
	    }  
	}  

	
	private static int getmiddle(int [] a,int low, int high) {

		int i = low, j = high;
		int x = a[low];
		while (i < j) {
			while (i < j && a[j] >= x)//一定要判断i<j
				j--;
			a[i] = a[j]; //将s[j]填到s[i]中，s[j]就形成了一个新的坑  
            i++; 

			while (i < j && a[i] < x)
				i++;
			a[j] = a[i]; //将s[i]填到s[j]中，s[i]就形成了一个新的坑  
            j--; 
		}
		//退出时，i等于j。将x填到这个坑中。  
	    a[i] = x;

		return i;
	}
	
	

}
