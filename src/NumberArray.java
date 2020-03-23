import java.util.Scanner;

public class NumberArray {
    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void addElement(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < array.length; index++) {
            System.out.printf("Enter element %-6d", index);
            array[index] = scanner.nextInt();
        }
    }

    public static void randomElement(int[] array, int max, int min) {
        int range = (max - min);
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * range) + min;
        }
    }

    public static int[] findMinArray(int[] array) {
        int min = array[0];
        int position = 0;
        int[] resultArray = new int[2];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
                position = index;
            }
        }
        resultArray[0] = min;
        resultArray[1] = position;
        return resultArray;
    }

    public static int[] findMaxArray(int[] array) {
        int max = array[0];
        int position = 0;
        int[] resultArray = new int[2];
        for (int index = 1; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
                position = index;
            }
        }
        resultArray[0] = max;
        resultArray[1] = position;
        return resultArray;
    }

    public static int[] findMaxNegativeArray(int[] array) {
        int max = 0;
        int position = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < 0) {
                max = array[index];
                position = index;
                break;
            }
        }
        for (int index = position; index < array.length; index++) {
            if (array[index] < 0) {
                if (array[index] > max) {
                    max = array[index];
                    position = index;
                }
            }
        }
        int[] result = new int[2];
        result[0] = max;
        result[1] = position;
        return result;
    }

    public static int[] findMinPositiveArray(int[] array) {
        int min = 0;
        int position = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > 0) {
                min = array[index];
                position = index;
                break;
            }
        }
        for (int index = position; index < array.length; index++) {
            if (array[index] > 0) {
                if (array[index] < min) {
                    min = array[index];
                    position = index;
                }
            }
        }
        int[] result = new int[2];
        result[0] = min;
        result[1] = position;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        boolean isValidSize = false;

        do {
            System.out.print("Enter array size: ");
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Invalid input. Size must be > 0");
            } else {
                isValidSize = true;
            }
        } while (!isValidSize);
        int [] demoArray = new int[size];

        boolean isValidChoice = false;
        int choice;
        do {
            System.out.println("Please choose how to add element: ");
            System.out.println("1. Add element from keyboard");
            System.out.println("2. Add random element");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            if (choice == 1 || choice == 2) {
                isValidChoice = true;
            } else {
                System.out.println("Invalid choice. Please choose again!");
            }
        } while (!isValidChoice);

        int max, min;
        switch (choice) {
            case 1:
                addElement(demoArray);
                break;
            case 2:
                System.out.println("Enter range you want to random");
                System.out.print("Upper limit is: ");
                max = scanner.nextInt();
                System.out.print("Bottom limit is: ");
                min = scanner.nextInt();
                randomElement(demoArray, max, min);
                break;
        }
        System.out.println();

        System.out.println("Here is your array: ");
        displayArray(demoArray);
        int[] result = findMinPositiveArray(demoArray);
        System.out.printf("The min positive is %d at %d \n", result[0], result[1]);
        result = findMaxNegativeArray(demoArray);
        System.out.printf("The max negative is %d at %d \n", result[0], result[1]);
    }
}
