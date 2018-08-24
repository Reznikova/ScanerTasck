import java.util.Scanner;


public class lessonScaner {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.println("Введите любое слово из трех букв: ");
        String phrase1 = abc.nextLine();
        System.out.println(phrase1);
    }
}
