/*
https://www.youtube.com/watch?v=Wls4vOx365g
This solution got inspired after I watched Nick White's video. It's definitely worth to practice over and over again.
*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String currentString = s.substring(0,k);
        String smallest = currentString;
        String largest = currentString;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 1; i <= s.length()-k ; i++){
            if(smallest.compareTo(s.substring(i,i+k))>0){
                smallest = s.substring(i,i+k);
            }
            if(largest.compareTo(s.substring(i,i+k))<0){
                largest = s.substring(i,i+k);
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}