import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        reverseArray(array);
        isParadigm(str);

    }

    static int[] reverseArray(int[] array) {
        int tmp;

        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

    static void isParadigm(String str) {

        //переделать в 2хуровневый цикл для пропуска пробелов

        int i = 0;

        while (i < str.length()-1) {
            if (str.charAt(i) == str.charAt((str.length()-1) - i)) {
                i++;
                continue;
            } else {
                System.out.println("Не является палиндромом");
            }
        }
        System.out.println("Является палиндромом");
    }


}