import java.util.Arrays;
import java.util.Random;

public class Zadania {
    public static int[] createArray(int n) {
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(101);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = array.clone();

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
    public static int[] reverseArray(int[] sortedArray) {
        int[] reversed = new int[sortedArray.length];
        for (int i = 0; i < sortedArray.length; i++) {
            reversed[i] = sortedArray[sortedArray.length - 1 - i];
        }
        return reversed;
    }

    public static boolean isInverse(int[] sortedArray, int[] reversed) {

        for (int i = 0; i < sortedArray.length; i++) {
            if (reversed[i] != sortedArray[sortedArray.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}

class Main {
    public static void main(String[] args) {
        int[] myArray = Zadania.createArray(5);
        Zadania.printArray(myArray);

        int[] sortedArray = Zadania.sortArray(myArray);
        System.out.println(Arrays.toString(sortedArray));

        int[] reversed = Zadania.reverseArray(sortedArray);
        System.out.println(Arrays.toString(reversed));

        System.out.println(Zadania.isInverse(sortedArray, reversed));
    }
}

