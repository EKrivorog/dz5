package org.example;

public class Main {
    public static void main(String[] args)
    {
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        int number4 = 40;
        int sum1 = number1 + number2;
        int sum2 = number3 + number4;

        boolean resultFirst = sum1 < sum2;
        System.out.println(resultFirst);

        sum1 += 1;
        sum2 -= 2;
        boolean resultSecond = sum1 > sum2;
        System.out.println(resultSecond);

        boolean resultThree = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println(resultThree);




    }
}