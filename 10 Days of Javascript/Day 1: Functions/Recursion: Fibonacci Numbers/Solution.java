import java.util.*;

public class Solution {

    public static int fibonacci(int n) {


        // Complete the function.
        int sum = 0;
        if(n>1){
            sum = fibonacci(n-1) + fibonacci(n-2);
        }
        if(n==1){
            sum = 1;
        }

        if(n==0){
            sum = 0;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}