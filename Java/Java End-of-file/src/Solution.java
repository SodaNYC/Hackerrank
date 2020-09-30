/*For all the people who are saying that how will the scanner.hasNext() condition will come false,then listen folks.
it is not described here but the input is coming from a text file and the scanner object starts to read from the top
and reads upto the end. When the end of the text file comes as there is nothing to read the condition become false and
loop brakes.*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNextLine()!= false){
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
    }
}