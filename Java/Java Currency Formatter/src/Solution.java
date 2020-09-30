import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usNF = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usNF.format(payment);

        Locale localeIndia = new Locale("en", "IN");//create Locale objects for the English language in India
        NumberFormat idNF = NumberFormat.getCurrencyInstance(localeIndia);
        String india = idNF.format(payment);

        NumberFormat cnNF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = cnNF.format(payment);

        NumberFormat frNF = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = frNF.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
