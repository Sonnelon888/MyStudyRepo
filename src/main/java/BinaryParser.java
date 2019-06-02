import java.util.Scanner;

public class BinaryParser {
    private Scanner scanner = new Scanner(System.in);
    private double result;

    private Integer parseBinary() {
        System.out.println("Enter binary num: ");
        String input = scanner.nextLine();
        Double[] values = new Double[input.toCharArray().length];
        for (int i = 0; i < input.toCharArray().length; i++) {
            values[i] = Double
                    .valueOf(
                            Character
                                    .toString(
                                            input
                                                    .toCharArray()[i]));
        }

        for (int n = values.length; n > 0; n--) {
                result += (values[values.length - n] * Math.pow(2, n - 1));
        }
        return (int) result;
    }

    public static void main(String[] args) {
        BinaryParser parser = new BinaryParser();
        System.out.println(parser.parseBinary());
    }
}