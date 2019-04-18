import java.util.Scanner;

public class wer {
        private static Scanner scanner =new Scanner(System.in) ;
        private static String input;
        private static int result;

    public static void main(String[] args) {
        System.out.println("Введите число 1: ");
        input = scanner.nextLine();
        if (Integer.parseInt(input) == 1){
            System.out.println("Вы ввели число 1");
        }
    }

}
