import java.util.Scanner;

public class BinaryParser {
    private Scanner scanner = new Scanner(System.in);


    private Integer parseBinary() {
        int result = 0;
        System.out.println("Enter binary num: ");
        String input = scanner.nextLine();
        for (int i = input.toCharArray().length; i > 0; i--) {
            result += Character
                    .getNumericValue(
                            input
                                    .toCharArray()[
                                    input
                                            .toCharArray()
                                            .length - i])
                    * (1 << (~-i));
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryParser parser = new BinaryParser();
        System.out.println(parser.parseBinary());
    }
}