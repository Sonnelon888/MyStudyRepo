import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        String filePath = "";
        Scanner scanner;
        BufferedReader bf;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Введите путь к файлу для чтения: ");
        try {
            filePath = reader.readLine();
            scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
