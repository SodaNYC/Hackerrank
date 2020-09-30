import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String output = "Null";
        /* Enter your code here. Print output to STDOUT. */
        if(A.length()==1){
            output = "Yes"; //Be careful when the the input has only one character. When it happens, we should set output as "Yes".
        }
        else{
            for(int i = 0; i<A.length()/2;i++){
                if(A.charAt(i)==A.charAt(A.length()-1-i)){
                    output = "Yes";
                }
                else{
                    output = "No";
                }
            }
        }
        System.out.println(output);
    }
}
