import java.util.Scanner;

public class Solution1 {
    static boolean flag = false;
    Scanner sc = new Scanner(System.in);
    static int B;
    static int H;
    //Write your code here
    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B>0 && B<=100 && H>0 && H<=100 ) {
            flag = true;
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive             ");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class