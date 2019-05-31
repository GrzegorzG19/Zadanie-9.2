import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz liczbe całkowitą a obliczę sumę ich cyfr");
        number = scan.nextInt();

        while (number != 0) {

            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
