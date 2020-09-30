/*A static initialization blocks allows more complex initialization, for example using conditionals; Or when more
than just construction is required: when using a builder to create your instance, exception handling or work other than
creating static fields is necessary. A static initialization block also runs after the inline static initializers.*/
import java.util.Scanner;

public class Solution2 {
    static boolean flag = false;
    Scanner sc = new Scanner(System.in);
    static int B;
    static int H;
    //Write your code here
    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        try{
            if (B>0 && B<=100 && H>0 && H<=100 ) {
                flag = true;
            }
            else{
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
