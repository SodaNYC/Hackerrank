import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int max = 0;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(true) {
            if(n%2==1){
                count++;
                if(count>max){
                    max = count;
                }
            }
            else {
                count = 0;
            }
            if(n/2 == 0){
                break;
            }
            n/=2;

        }
        System.out.println(max);
        scanner.close();
    }
}