import java.util.Scanner;

public class MultiTable {
    private String inputString;
    private int input;
    private Scanner scanner = new Scanner(System.in);

    public void printMultiTable(){
        System.out.println("Enter num for generate table: ");
        inputString = scanner.nextLine();
        input = Integer.parseInt(inputString);
        System.out.println("Multiplication table for: "+ input +
                "\n"+ input + " x 1 = " + input +
                "\n"+ input + " x 2 = " + input * 2 +
                "\n"+ input + " x 3 = " + input * 3 +
                "\n"+ input + " x 4 = " + input * 4 +
                "\n"+ input + " x 5 = " + input * 5 +
                "\n"+ input + " x 6 = " + input * 6 +
                "\n"+ input + " x 7 = " + input * 7 +
                "\n"+ input + " x 8 = " + input * 8 +
                "\n"+ input + " x 9 = " + input * 9 +
                "\n"+ input + " x 10 = " + input * 10 );
    }

    public static void main(String[] args) {
        MultiTable table = new MultiTable();
        table.printMultiTable();
    }
}
