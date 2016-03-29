package leetcode;

public class NIm_Game {

	public static void main(String[] args) {

		/*You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.

		Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

		For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
		*/
		int m = 12;
		if(canWinNim(m)){
			System.out.println("赢");
		}else{
			System.out.println("输");
		}
		
		
	}
	public static boolean canWinNim(int n) {
        return n % 4 != 0;
        /*根据题设条件： 当n∈[1,3]时，先手必胜。

		当n == 4时，无论先手第一轮如何选取，下一轮都会转化为n∈[1,3]的情形，此时先手必负。

		当n∈[5,7]时，先手必胜，先手分别通过取走[1,3]颗石头，可将状态转化为n == 4时的情形，此时后手必负。

		当n == 8时，无论先手第一轮如何选取，下一轮都会转化为n∈[5,7]的情形，此时先手必负。*/
    }

}
