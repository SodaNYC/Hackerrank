import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] newArr = new int[n];
        int j = n; /*if we use n directly into the for loop below, we only can print out less output, because n got
                     reduced which means the size of array got reduced*/
        for(int i = 0; i < n; i++) {
            newArr[i] = arr[j-1];
            System.out.print(newArr[i]+" ");

            if(j-1>0){
                j--;
            }

        }

        scanner.close();
    }
}