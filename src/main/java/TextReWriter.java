import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class TextReWriter {
    private String path = "";
    private BufferedReader reader;
    private BufferedWriter writer;
    private Scanner scanner;
    private int lineCounter;

    private int getLineCounter() {
        return lineCounter;
    }

    private void setLineCounter(int lineCounter) {
        this.lineCounter = lineCounter;
    }

    private String getPath() {
        return path;
    }

    private void setPath(String path) {
        this.path = path;
    }

    private void takeFilePathFromUser() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите путь к файлу:");
        try {
            setPath(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printTextFromFile(String path) {
        int i = 0;
        System.out.println("Указанный файл содержал в сеье следующие данные:");
        try {
            scanner = new Scanner(new FileReader(new File(path)));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setLineCounter(i);
    }

    private List<String> takeTextFromUser() {
        List<String> result = new ArrayList<>();
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите " + getLineCounter() + " строк для перезаписи файла:");
        try {
            for (int i = 0; i < getLineCounter(); i++) {
                result.add(reader.readLine());
            }
            scanner.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private void printTextTofile(String path, Collection<String> text) {
        try {
            writer = new BufferedWriter(new FileWriter(new File(path)));
            text.forEach(S -> {
                try {
                    writer.write(S + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.close();
            System.out.println("Запись в файл выполнена успешно!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void run() {
        TextReWriter trw = new TextReWriter();
        trw.takeFilePathFromUser();
        trw.printTextFromFile(trw.getPath());
        trw.printTextTofile(trw.getPath(), trw.takeTextFromUser());
    }

    public static void main(String[] args) {
        run();
    }
}
