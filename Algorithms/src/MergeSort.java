import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// �ϲ����鲢������
		//˼�룺�ݹ�ͷ���
		//�Ƚ�left[l]��right[r]�Ĵ�С����left[l]��right[r]���򽫵�һ��������е�Ԫ��left[l]���Ƶ�result[i]�У�
		//����l��i�ֱ����1�����򽫵ڶ���������е�Ԫ��right[r]���Ƶ�result[i]�У�����j��k�ֱ����1��
		//���ѭ����ȥ��ֱ������һ�������ȡ�꣬Ȼ���ٽ���һ���������ʣ���Ԫ�ظ��Ƶ�result��.
		//�鲢������㷨����ͨ���õݹ�ʵ�֣��ȰѴ������������е���֣�
		//���Ű���������������ٰ��ұ������������������������������һ�ι鲢�����ϲ������������.
		
		int [] a = new int [] {4,3,6,1,2,5};
		mergeSort(a);
		for(int i = 0;i < a.length;i++)
			System.out.println(a[i]);
	}

	public static void mergeSort(int[] array) {

		int length = array.length;
		int middle = length / 2;

		if (length > 1) {

			int[] left = Arrays.copyOfRange(array, 0, middle);// ��������array����벿��
			int[] right = Arrays.copyOfRange(array, middle, length);// ��������array���Ұ벿��
			mergeSort(left);// �ݹ�array����벿��
			mergeSort(right);// �ݹ�array���Ұ벿��
			merge(array, left, right);// ������벿�֡��Ұ벿�ֺϲ���Array

		}
	}

	// �ϲ����飬����
	private static void merge(int[] result, int[] left, int[] right) {

		int i = 0, l = 0, r = 0;

		while (l < left.length && r < right.length) {//��l=left.length || r = right.lengthʱ�˳�ѭ�����п�����һ���ֻ�ʣ��

			if (left[l] < right[r]) {
				result[i] = left[l];
				i++;
				l++;
			} else {
				result[i] = right[r];
				i++;
				r++;
			}
		}

		while (r < right.length) {// ����ұ�ʣ�ºϲ��ұߵ�
			result[i] = right[r];
			r++;
			i++;
		}

		while (l < left.length) {// ������ʣ�ºϲ���ߵ�
			result[i] = left[l];
			l++;
			i++;
		}
	}
}
