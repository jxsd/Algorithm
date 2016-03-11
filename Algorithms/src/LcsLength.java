
public class LcsLength {

	public static void main(String[] args) {
		
		String a = "jashdfkjl";  
        String b = "hajlfhjkhasjd";  
        LCS(a, b); 
		
	}

	private static void LCS(String str1,String str2) {
		char[] a = str1.toCharArray();  
        char[] b = str2.toCharArray();  
        int a_length = a.length;  
        int b_length = b.length;  
        int[][] lcs = new int[a_length + 1][b_length + 1];  
        // ��ʼ������  
        for (int i = 0; i <= b_length; i++) {  
            for (int j = 0; j <= a_length; j++) {  
                lcs[j][i] = 0;  
            }  
        }  
        
        for (int i = 1; i <= a_length; i++) {  
            for (int j = 1; j <= b_length; j++) {  
                if (a[i - 1] == b[j - 1]) {  
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;  
                }  
                if (a[i - 1] != b[j - 1]) {  
                    lcs[i][j] = lcs[i][j - 1] > lcs[i - 1][j] ? lcs[i][j - 1] : lcs[i - 1][j];  
                }  
            }  
        }  
        
     /*// ������������й۲�  
        for (int i = 0; i <= a_length; i++) {  
            for (int j = 0; j <= b_length; j++) {  
                System.out.print(lcs[i][j]+",");  
            }  
            System.out.println("");  
        } */ 
        // �����鹹����С�����ַ���  
        int max_length = lcs[a_length][b_length];  
        char[] comStr = new char[max_length];  
        int i =a_length, j =b_length;  
        while(max_length>0){  
            if(lcs[i][j]!=lcs[i-1][j-1]){  
                if(lcs[i-1][j]==lcs[i][j-1]){//���ַ���ȣ�Ϊ�����ַ�  
                    comStr[max_length-1]=a[i-1];  
                    max_length--;  
                    i--;j--;  
                }else{//ȡ�����нϳ�����ΪA��B�������������  
                    if(lcs[i-1][j]>lcs[i][j-1]){  
                        i--;  
                    }else{  
                        j--;  
                    }  
                }  
            }else{  
                i--;j--;  
            }  
        }  
        System.out.print("������ַ����ǣ�");  
        System.out.print(comStr);  
		
	}

	
}
