package trytodoit;

import java.util.Scanner;

public class twoVariants {
        public static void main(String[] args){
            Scanner test = new Scanner(System.in);
            System.out.println("Введите любые 2 слова: ");
            String phrase1 = test.nextLine();
            String phrase2 = test.nextLine();
            System.out.println(phrase1 + phrase2);
        }
    }


