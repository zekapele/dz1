import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 15;
        int[] numbers = new int[size];
        Random rand = new Random();

        System.out.println("Оригінальний масив:");
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100); // від 0 до 99
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n\nСортування злиттям:");
        ArrayUtils.mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));

        int target = numbers[rand.nextInt(size)]; 
        System.out.println("\nПошук елемента: " + target);

        int index = ArrayUtils.binarySearch(numbers, target);
        if (index != -1) {
            System.out.println("Елемент знайдено на позиції: " + index);
        } else {
            System.out.println("Елемент не знайдено.");
        }
    }
}
