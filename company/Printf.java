package com.company;

import java.util.Date;
import java.util.Locale;

public class Printf {
    public static void main(String[] args) {
        //Line Separator
//        System.out.printf("baeldung%nline%nterminator%n");
//
//        //Boolean Formatting
//        System.out.printf("%b%n", null);
//        System.out.printf("%B%n",false);
//
//        System.out.printf("%B%n", 5.3);
//        System.out.printf("%b%n", "random text");
//        System.out.printf("'%s'%n", "baeldung");
//        System.out.printf("'%S'%n", "baeldung");
//
//        // To specify minimum length, we can specify a width.
//        System.out.printf("'%10s' %n", "baeldung");
//
//        //Left justify our string
//        System.out.printf("'%-10s' %n", "baeldung");
//
//        //Limit the number of characters in our output by specifying a precision.
//        //%x.ys =>  x is the number of padding. 'y' is the number of characters
//        System.out.printf("'%2.2s' %n", "Hi there!");
//
//        System.out.printf("%c%n", 's');
//        System.out.printf("Simple integer: %d%n", 10000L);
//
//        //Format numbers with thousand separators, we use the flag.
//        System.out.printf(Locale.US, "%,d %n",10000L);
//        System.out.printf(Locale.ITALY, "%,d %n",10000L);
//
//        //To format a float number, the 'f' format:
//        System.out.printf("%f%n",5.1473);
//        System.out.printf("'%5.2f'%n", 5.1473);
//
//        //To have our output in scientific notation.
//        System.out.printf("'%5.3e'%n", 5.1473);
//
//        Date date = new Date();
//        System.out.printf("%tT%n", date);
//        System.out.printf("%tH hours: %tM minutes : %tS seconds",date,date,date);
//
//        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", date);
//        System.out.printf("%1$tA, %1$tB %1$tY %n", date);
//        System.out.printf("%02d\n", 9);

        int multiples = 2;
        for(int i = 1; i <= 10; i++) {
            System.out.println(multiples + " " + "x " + i + " = " + multiples * i );
        }
    }
}
