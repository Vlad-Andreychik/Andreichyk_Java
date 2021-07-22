import java.util.Scanner;


public class FirstTask {
    public static void main(String [] args){
        System.out.println("Введите любое число ");
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            if (number>7){
                System.out.println("Привет");
            }
            else{
                System.out.println("Вы ввели число "+number+". До свидания");
            }
        }
        catch (Exception ex){
            System.out.println("Введен неверный тип данных. До свидания");
        }
    }
}
