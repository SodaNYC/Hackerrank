import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int count = A.length() + B.length();
        System.out.println(count);

        if(A.compareTo(B)<=0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }

        String capitalizedA = A.substring(0,1).toUpperCase()+A.substring(1);
        String capitalizedB = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

    }
}
