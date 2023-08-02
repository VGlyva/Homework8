import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = {1, 2, 3};
        double[] fractional = {1.57, 7.654, 9.986};
        long[] large = {5, 7, 8};
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        double[] fractional = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractional.length; i++) {
            if (i == fractional.length - 1) {
                System.out.println(fractional[i]);
                break;
            }
            System.out.print(fractional[i] + ", ");
        }
        long[] large = {5, 7, 8};
        for (int i = 0; i < large.length; i++) {
            if (i == large.length - 1) {
                System.out.print(large[i]);
                break;
            }
            System.out.print(large[i] + ", ");
        }
        System.out.println();
        System.out.println();
    }
        public static void task3() {
            System.out.println("Задача 3");
            int[] numbers = {1, 2, 3};
            for (int i = numbers.length - 1; i >= 0; i = i - 1) {
                if (i == 0) {
                    System.out.println(numbers[i]);
                    break;
                }
                System.out.print(numbers[i] + " ,");
            }
            double[] fractional = {1.57, 7.654, 9.986};
            for (int i = numbers.length - 1; i >= 0; i = i - 1) {
                if (i == 0) {
                    System.out.println(fractional[i]);
                    break;
                }
                System.out.print(fractional[i] + ", ");
            }
            long[] large = {5, 7, 8};
            for (int i = numbers.length - 1; i >= 0; i = i - 1) {
                if (i == 0) {
                    System.out.print(large[i]);
                    break;
                }
                System.out.print(large[i] + ", ");
            }
            System.out.println();
            System.out.println();
        }
        public static void task4() {
            System.out.println("Задача 4");
            int [] numbers = {1, 2, 3};
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    numbers[i] += 1;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
}

