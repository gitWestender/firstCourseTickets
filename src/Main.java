public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        reverseArray(array);

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


}