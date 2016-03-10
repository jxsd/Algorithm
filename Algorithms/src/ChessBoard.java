import java.util.Scanner;
import java.util.function.Function;

public class ChessBoard {

	public static void main(String[] args) {
		//棋盘覆盖
		//棋盘的规格2的k次方*2的k次方，在这么一个棋盘中有一个特殊方格，特殊方格出现在棋盘的位置有
		//4的k次方中情况，用L型骨牌去覆盖除了特殊方格之外的其它所有方格，可知：需要L型骨牌的数量的
		//的个数为4的K次方除以3，
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个整数分别代表：特殊方格的行号，特殊方格的列号，棋盘的规格");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		function(0, 0, n1, n2, n3);
	    
	    

	}
	
	@SuppressWarnings("null")
	public static void function(int tr,int tc,int dr,int dc,int size){
		//tr代表棋盘左上角的行号，tc代表棋盘左上角的列号，dr代表特殊方格的行号，
		//dc代表特殊方格的所在的列号,size代表棋盘的规格,棋盘的规格2的k次方*2的k次方
		//思想：递归与分治
		//一个2的k次方*2的k次方分成4个2的k-1次方*2的k-1次方的小棋盘，特殊方格一定在四个小棋盘
		//中的一个里，在四个小棋盘会和处用一个L型骨牌覆盖，不断分割，直到分出最后一个1*1的棋盘。
		int tile = 0 ;
		if(size == 1)
			return;
		int t = tile++ ,//L型骨牌号
			s = size/2;//分割棋盘
		int[][] board = null;
		
		//覆盖左上角子棋盘
		if(dr < tr+s && dc < tc+s)
			//特殊方格在此棋盘中
			function(tr,tc,dr,dc,s);
		else{
			//特殊方格不在此棋盘中
			//用t号骨牌覆盖右下角
			board[tr+s-1][tc+s-1] = t;
			//覆盖其余方格
			function(tr, tc, tr+s-1, tc+s-1, s);//把最角落的已经覆盖的方格当作特殊方格
		}
		
		//覆盖右上角子棋盘
		if(dr < tr+s && dc >= tc+s)
			//特殊方格在此棋盘中
			function(tr,tc+s,dr,dc,s);
		else{
			//特殊方格不在此棋盘中
			//用t号骨牌覆盖左下角
			board[tr+s-1][tc+s] = t;
			//覆盖其余方格
			function(tr, tc+s, tr+s-1, tc+s, s);
		}
		
		// 覆盖左下角子棋盘
		if (dr >= tr + s && dc < tc + s)
			// 特殊方格在此棋盘中
			function(tr+s, tc, dr, dc, s);
		else {
			// 特殊方格不在此棋盘中
			// 用t号骨牌覆盖右下角
			board[tr+s][tc+s-1] = t;
			//覆盖其余方格
			function(tr+s, tc, tr + s , tc + s - 1, s);
		}
		
		// 覆盖右下角子棋盘
		if (dr >= tr + s && dc >= tc + s)
			// 特殊方格在此棋盘中
			function(tr+s, tc+s, dr, dc, s);
		else {
			// 特殊方格不在此棋盘中
			// 用t号骨牌覆盖右下角
			board[tr+s][tc+s] = t;
			//覆盖其余方格
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
