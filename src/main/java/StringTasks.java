import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringTasks {

    private String firstResult = "";
    private String secondResult = "";

    public void work11(){
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Введите строку: ");
        try {
            firstResult  = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Вы ввели строку:\n" + firstResult);
    }

    public void work12(){
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Введите строку для удаления пробелов: ");
        try {
            secondResult  = reader.readLine().replaceAll(" ","");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Строка без пробелов выглядит следующим образом:\n" + secondResult);
    }

    public void work13(){
        System.out.println("Строка с наибольшей длинной: ");
        if(firstResult.length() > secondResult.length()){
            System.out.println(firstResult);
        }else{
            System.out.println(secondResult);
        }
    }

    public static void main(String[] args) {
        StringTasks st = new StringTasks();
        st.work11();
        st.work12();
        st.work13();
    }
}
