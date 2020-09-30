import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /*
        Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads
        integer tokens; because of this, the last newline character for that line of integer input is still queued in
        the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

        After supplying data for int, we would hit the enter key. What nextInt() and nextDouble() does is it assigns
        integer to appropriate variable and keeps the enter key(\n) unread in the keyboard buffer. So when it's time to
        supply String, the nextLine() will read the enter key from the user thinking that the user has entered the enter
        key.(that's we get empty output).

        nextInt(): it only reads the int value, nextInt() places the cursor in the same line after reading the input.

        next(): it scans for tokens (you can think of this as a word), it reads the input only till the space. It can't
        read two words separated by space. Also, next() places the cursor in the same line after reading the input.

        nextLine(): reads from the Scanner's current location until the beginning of the next line. It reads input
        including space between the words. Once the input is read,
        nextLine() positions the cursor in the next line.
        */

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}