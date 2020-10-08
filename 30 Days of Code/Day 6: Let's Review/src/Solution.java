import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            String S = sc.next();
            char[] ar = S.toCharArray();
            for(int j = 0; j<ar.length;j += 2){
                System.out.print(ar[j]);
            }
            System.out.print(" ");
            for(int k = 1; k<ar.length;k += 2){
                System.out.print(ar[k]);
            }
            System.out.println(" ");
        }


    }
}