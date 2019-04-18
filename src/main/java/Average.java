import java.util.Scanner;

public class Average {
    private Scanner scanner = new Scanner(System.in);
    private int arithmeticAverage;
    private int i = 0;

    public void getArithmeticAverage() {
        System.out.println("Введите числа в одну строку через пробел, нажмите ENTER" +
                " и введите маркер \"конец файла\"\n" +
                " Win = Ctrl + Z, Unix & MacOs = Ctrl + D :");
        while (scanner.hasNextInt()) {
            i++;
            arithmeticAverage += scanner.nextInt();
        }
        scanner.close();
        arithmeticAverage /= i;
        System.out.println("Среднее арифметическое чисел: " + arithmeticAverage);
    }

    public void checkAnswer() {
        if ((arithmeticAverage /= 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }

    public static void main(String[] args) {
        Average average = new Average();
        average.getArithmeticAverage();
        average.checkAnswer();

    }
}
