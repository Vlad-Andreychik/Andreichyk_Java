import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите размер массива");
            int size = scanner.nextInt();
            int[] numbers = new int[size];
            System.out.println("Введите элементы массива");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
            System.out.println("Элементы массива, кратные трем представлены ниже.");
            for (int k: numbers) {
                if (k%3==0){
                    System.out.println(k);
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Введен неверный тип данных. До свидания");

        }
    }
}
