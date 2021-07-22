import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class SecondTask {
    public static void main(String [] args) throws IOException {
        System.out.println("Как вас зовут? ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String ActualName = reader.readLine();
        String ExpectedName = "Вячеслав";
        if (ActualName.equalsIgnoreCase(ExpectedName)){
            System.out.println("Привет, "+ExpectedName);
            }
        else {
            System.out.println("Вы ввели \""+ActualName+"\". Такого имени нет.");
        }
    }
}
