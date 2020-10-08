import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i = 0; i < 10 ; i++) {
            int result = n * (i+1);
            System.out.println(n + " x " + (i+1) + " = " + result);

        }
        scanner.close();
    }
}
