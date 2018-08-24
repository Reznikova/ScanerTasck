package Cikli.WhileC.ForC.ForSum;

import java.util.Scanner;

public class ForSum {
    public static void main(String[] args) {
        System.out.println("Введите любое положительное число");
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int sum = 0;
        for (int A=1; A <=n; A++) {
            sum = sum+A;
        }
        System.out.println(sum);

    }
}
