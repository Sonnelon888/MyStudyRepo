import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class TextWriter {

    public static void main(String[] args) {
        String pathname = "";
        String textToFile;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Введите путь для файла, который хотите записать: ");
        try {
            pathname = reader.readLine();
            FileWriter fileReader = new FileWriter(
                    new File(pathname)
            );
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
            System.out.println(
                    "Введите текст файла, который хотите записать, по окончании ввода" +
                            " текста \n введите команду СТОП с новой строки и нажмите ENTER");
            while (!
                    (textToFile = reader.readLine())
                            .equals("СТОП")) {
                bufferedWriter.write(textToFile + "\n");
            }
            reader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(
                String.format("Запись в файл по пути: %s - выполнена", pathname));
    }
}
