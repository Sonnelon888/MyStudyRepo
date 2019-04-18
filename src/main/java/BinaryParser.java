import java.util.Scanner;

public class BinaryParser {
    private Scanner scanner =new Scanner(System.in) ;
    private String input;
    private int result;

    public void parseBinary() {
        System.out.println("Enter binary num: ");
        input = scanner.nextLine();
        result = Integer.parseInt(input, 2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        BinaryParser parser = new BinaryParser();
        parser.parseBinary();
    }
}