import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            int numBlank = 15 - s1.length();
            String blank = "";
            for(int j = 0;j<numBlank;j++){
                blank += " ";
            }

            String number = Integer.toString(x);
            if(x>=0&&x<=9){
                number = "00"+number;
            }
            else if(x>=10 && x<=99){
                number = "0"+number;
            }
            else if(x>=100 && x<=999){
                number = number;
            }
            else{
                System.out.println("each integer will be in the inclusive range from 0 to 999.");
            }
            System.out.println(s1+blank+number);
        }
        System.out.println("================================");

    }
}
