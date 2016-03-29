package leetcode;

import java.util.Scanner;

public class Add_digits {

	public static void main(String[] args) {
		
		
		/*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

		For example:

		Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字的大小n");
		int n = sc.nextInt();
		int m=addDigits(n);
		System.out.println(m);
	}
	
	public static int addDigits(int num) {
        while(num>=10){  //第一种:逐位相加直到小于10
           num = (num/10)+num%10;  
       }  
       return num;  
       //第二种：return 1 + (num-1)%9;
   }
	

}
