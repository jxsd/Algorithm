import java.util.Scanner;
import java.util.function.Function;

public class ChessBoard {

	public static void main(String[] args) {
		//���̸���
		//���̵Ĺ��2��k�η�*2��k�η�������ôһ����������һ�����ⷽ�����ⷽ����������̵�λ����
		//4��k�η����������L�͹���ȥ���ǳ������ⷽ��֮����������з��񣬿�֪����ҪL�͹��Ƶ�������
		//�ĸ���Ϊ4��K�η�����3��
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������ֱ�������ⷽ����кţ����ⷽ����кţ����̵Ĺ��");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		function(0, 0, n1, n2, n3);
	    
	    

	}
	
	@SuppressWarnings("null")
	public static void function(int tr,int tc,int dr,int dc,int size){
		//tr�����������Ͻǵ��кţ�tc�����������Ͻǵ��кţ�dr�������ⷽ����кţ�
		//dc�������ⷽ������ڵ��к�,size�������̵Ĺ��,���̵Ĺ��2��k�η�*2��k�η�
		//˼�룺�ݹ������
		//һ��2��k�η�*2��k�η��ֳ�4��2��k-1�η�*2��k-1�η���С���̣����ⷽ��һ�����ĸ�С����
		//�е�һ������ĸ�С���̻�ʹ���һ��L�͹��Ƹ��ǣ����Ϸָֱ���ֳ����һ��1*1�����̡�
		int tile = 0 ;
		if(size == 1)
			return;
		int t = tile++ ,//L�͹��ƺ�
			s = size/2;//�ָ�����
		int[][] board = null;
		
		//�������Ͻ�������
		if(dr < tr+s && dc < tc+s)
			//���ⷽ���ڴ�������
			function(tr,tc,dr,dc,s);
		else{
			//���ⷽ���ڴ�������
			//��t�Ź��Ƹ������½�
			board[tr+s-1][tc+s-1] = t;
			//�������෽��
			function(tr, tc, tr+s-1, tc+s-1, s);//���������Ѿ����ǵķ��������ⷽ��
		}
		
		//�������Ͻ�������
		if(dr < tr+s && dc >= tc+s)
			//���ⷽ���ڴ�������
			function(tr,tc+s,dr,dc,s);
		else{
			//���ⷽ���ڴ�������
			//��t�Ź��Ƹ������½�
			board[tr+s-1][tc+s] = t;
			//�������෽��
			function(tr, tc+s, tr+s-1, tc+s, s);
		}
		
		// �������½�������
		if (dr >= tr + s && dc < tc + s)
			// ���ⷽ���ڴ�������
			function(tr+s, tc, dr, dc, s);
		else {
			// ���ⷽ���ڴ�������
			// ��t�Ź��Ƹ������½�
			board[tr+s][tc+s-1] = t;
			//�������෽��
			function(tr+s, tc, tr + s , tc + s - 1, s);
		}
		
		// �������½�������
		if (dr >= tr + s && dc >= tc + s)
			// ���ⷽ���ڴ�������
			function(tr+s, tc+s, dr, dc, s);
		else {
			// ���ⷽ���ڴ�������
			// ��t�Ź��Ƹ������½�
			board[tr+s][tc+s] = t;
			//�������෽��
			function(tr+s, tc+s, tr + s , tc + s, s);
		}
		
		int i;
	    int j;
	    for(i = 0; i < size; i++)
	    {
	        for(j = 0; j < size; j++)
	        {
	            System.out.println(board[i][j]);
	        }
	        System.out.println(System.getProperty("line.separator"));
	    }
		
	}

}
