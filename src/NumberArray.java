import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int number;
        int[] result = new int[0];
        boolean isValidSize = false;
        boolean isExit = false;

        do {
            System.out.print("Enter array size: ");
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Invalid input. Size must be > 0");
            } else {
                isValidSize = true;
            }
        } while (!isValidSize);
        int[] demoArray = new int[size];

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
        isValidChoice = false;
        System.out.println();
        System.out.println("Here is your array: ");
        displayArray(demoArray);
        System.out.println();

        do {
            do {
                System.out.println("Manipulate Array!");
                System.out.println("1. Find min/max in array");
                System.out.println("2. Calculate Element");
                System.out.println("3. Check special Number");
                System.out.println("4. Rearrange Array.");
                System.out.println("5. Add / Remove Element to Array");
                System.out.println("0. Exit program!");
                System.out.print("Enter choice: ");
                choice = scanner.nextInt();
                if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 0) {
                    System.out.println("Invalid choice! Please choose again!");
                } else {
                    isValidChoice = true;
                }
            } while (!isValidChoice);
            isValidChoice = false;
            System.out.println();

            switch (choice) {
                case 1:
                    do {
                        System.out.println("1. Find max in array");
                        System.out.println("2. Find min in array");
                        System.out.println("3. Find negative max in array");
                        System.out.println("4. Find positive min in array");
                        System.out.print("Enter choice: ");
                        choice = scanner.nextInt();
                        if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                            System.out.println("Invalid choice!. Please choose again");
                        } else {
                            isValidChoice = true;
                        }
                    } while (!isValidChoice);
                    System.out.println();
                    switch (choice) {
                        case 1:
                            result = findMaxArray(demoArray);
                            System.out.printf("The max element is %d at %d \n", result[0], result[1]);
                            break;
                        case 2:
                            result = findMinArray(demoArray);
                            System.out.printf("The min element is %d at %d \n", result[0], result[1]);
                            break;
                        case 3:
                            result = findMaxNegativeArray(demoArray);
                            System.out.printf("The max negative is %d at %d \n", result[0], result[1]);
                            break;
                        case 4:
                            result = findMinPositiveArray(demoArray);
                            System.out.printf("The min positive is %d at %d \n", result[0], result[1]);
                            break;
                    }
                    break;
                case 2:
                    isValidChoice = false;
                    do {
                        System.out.println("1. Sum Element");
                        System.out.println("2. Product Element");
                        System.out.println("3. Average Element");
                        System.out.print("Enter choice: ");
                        choice = scanner.nextInt();
                        if (choice != 1 && choice != 2 && choice != 3) {
                            System.out.println("Invalid choice!. Please choose again");
                        } else {
                            isValidChoice = true;
                        }
                    } while (!isValidChoice);
                    System.out.println();
                    switch (choice) {
                        case 1:
                            number = sumElement(demoArray);
                            System.out.println("Sum of element is: " + number);
                            break;
                        case 2:
                            number = productElement(demoArray);
                            System.out.println("Product of element is: " + number);
                            break;
                        case 3:
                            number = averageElement(demoArray);
                            System.out.println("Average of element is: " + number);
                            break;
                    }
                    break;
                case 3:
                    isValidChoice = false;
                    do {
                        System.out.println("1. Find Prime Number");
                        System.out.println("2. Find Square Number");
                        System.out.println("3. Find Perfect Number");
                        System.out.print("Enter choice: ");
                        choice = scanner.nextInt();
                        if (choice != 1 && choice != 2 && choice != 3) {
                            System.out.println("Invalid choice!. Please choose again");
                        } else {
                            isValidChoice = true;
                        }
                    } while (!isValidChoice);
                    System.out.println();
                    switch (choice) {
                        case 1:
                            result = findPrimeNumber(demoArray);
                            System.out.printf("There is %d Prime number \n", result.length);
                            break;
                        case 2:
                            result = findSquareNumber(demoArray);
                            System.out.printf("There is %d Square number \n", result.length);
                            break;
                        case 3:
                            result = findPerfectNumber(demoArray);
                            System.out.printf("There is %d Perfect number \n", result.length);
                            break;
                    }
                    for (int index = 0; index < result.length; index++) {
                        System.out.printf("%6d", result[index]);
                    }
                    break;
                case 4:
                    isValidChoice = false;
                    do {
                        System.out.println("1. Arrange Ascending");
                        System.out.println("2. Arrange Descending");
                        System.out.print("Enter choice: ");
                        choice = scanner.nextInt();
                        if (choice != 1 && choice != 2) {
                            System.out.println("Invalid choice!. Please choose again");
                        } else {
                            isValidChoice = true;
                        }
                    } while (!isValidChoice);
                    System.out.println();
                    switch (choice) {
                        case 1:
                            arrangeArray(demoArray, false);
                            break;
                        case 2:
                            arrangeArray(demoArray, true);
                            break;
                    }
                    System.out.println("Here is the new array: ");
                    displayArray(demoArray);
                    System.out.println();
                    break;
                case 5:
                    isValidChoice = false;
                    int index;
                    int value;
                    do {
                        System.out.println("1. Add Element to a fix index");
                        System.out.println("2. Add Element to a arrange array");
                        System.out.println("3. Remove Single Element from array");
                        System.out.println("4. Remove all Element from array");
                        System.out.print("Enter choice: ");
                        choice = scanner.nextInt();
                        if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                            System.out.println("Invalid choice!. Please choose again");
                        } else {
                            isValidChoice = true;
                        }
                    } while (!isValidChoice);
                    System.out.println();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter value you want to add: ");
                            value = scanner.nextInt();
                            do {
                                System.out.print("Enter index you want to add: ");
                                index = scanner.nextInt();
                                if (index < 0 || index > demoArray.length) {
                                    System.out.println("Invalid input. Please enter again!");
                                }
                            } while (index < 0 || index > demoArray.length);
                            addElement(demoArray, index, value);
                            break;
                        case 2:
                            System.out.print("Enter value you want to add: ");
                            value = scanner.nextInt();
                            addElementToArrangeArray(demoArray, value);
                            break;
                        case 3:
                            System.out.print("Enter Element you want to remove: ");
                            value = scanner.nextInt();
                            removeElement(demoArray, value);
                            break;
                        case 4:
                            System.out.print("Enter Element you want to remove: ");
                            value = scanner.nextInt();
                            removeAllElement(demoArray, value);
                            break;
                    }
                    System.out.println();
                    System.out.println("Here is the new array: ");
                    displayArray(demoArray);
                    System.out.println();
                    break;
                case 0:
                    isExit = true;
                    System.out.println("Exit Program!");
            }
        } while (!isExit);
    }

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

    public static int sumElement(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static int productElement(int[] array) {
        int product = 1;
        for (int element : array) {
            product *= element;
        }
        return product;
    }

    public static int averageElement(int[] array) {
        int sum = 0;
        int average;
        for (int element : array) {
            sum += element;
        }
        average = sum / array.length;
        return average;
    }

    public static int[] findPrimeNumber(int[] array) {
        int count = 0;
        for (int element : array) {
            if (isPrime(element)) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int element : array) {
            if (isPrime(element)) {
                result[index] = element;
                index++;
            }
        }
        return result;
    }

    public static int[] findSquareNumber(int[] array) {
        int count = 0;
        for (int element : array) {
            if (isSquareNumber(element)) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int element : array) {
            if (isSquareNumber(element)) {
                result[index] = element;
                index++;
            }
        }
        return result;
    }

    public static int[] findPerfectNumber(int[] array) {
        int count = 0;
        for (int element : array) {
            if (isPerfectNumber(element)) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int element : array) {
            if (isPerfectNumber(element)) {
                result[index] = element;
                index++;
            }
        }
        return result;
    }

    public static boolean isPerfectNumber(int number) {
        int total = 0;
        if (number > 0) {
            for (int index = 1; index < number; index++) {
                if (number % index == 0) {
                    total += index;
                }
            }
            return total == number;
        }
        return false;
    }

    public static boolean isSquareNumber(int number) {
        if (number > 0) {
            for (int index = 1; index <= Math.sqrt(number); index++) {
                if (Math.pow(index, 2) == number) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number > 2) {
            for (int index = 2; index <= Math.sqrt(number); index++) {
                if (number % index == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void addElement(int[] array, int position, int value) {
        for (int index = array.length - 1; index > position; index--) {
            array[index] = array[index - 1];
        }
        array[position] = value;
    }

    public static void addElementToArrangeArray(int[] array, int value) {
        boolean isAscending = true;
        boolean isArrange = true;
        int countAscend = 0;
        int countDescend = 0;
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] <= array[index + 1]) {
                countAscend++;
            } else {
                countDescend++;
            }
        }
        if (countAscend != 0 && countDescend != 0) {
            isArrange = false;
        }
        if (countAscend == 0) {
            isAscending = false;
        }
        int position = 0;
        if (isArrange) {
            if (isAscending) {
                for (int index = 0; index < array.length -1; index++) {
                    if (array[index] <= value && array[index + 1] >= value) {
                        position = index + 1;
                        break;
                    }
                }
            }
            for (int index = 0; index < array.length -1; index++) {
                if (array[index] >= value && array[index + 1] <= value) {
                    position = index + 1;
                    break;
                }
            }
            for (int index = array.length - 1; index > position; index--) {
                array[index] = array[index - 1];
            }
            array[position] = value;
        }
    }

    public static void removeElement(int[] array, int value) {
        int position = array.length - 1;
        if (array[array.length - 1] == value) {
            array[array.length - 1] = 0;
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                position = index;
                break;
            }
        }
        for (int index = position; index < array.length - 1; index++) {
            array[index] = array[index + 1];
        }
    }

    public static void removeAllElement(int[] array, int value) {
        boolean isExist;
        int position = -1;
        if (array[array.length - 1] == value) {
            array[array.length - 1] = 0;
        }
        do {
            for (int index = 0; index < array.length; index++) {
                if (array[index] == value) {
                    position = index;
                    break;
                } else {
                    position = -1;
                }
            }
            if (position != -1) {
                isExist = true;
            } else {
                isExist = false;
            }
            if (isExist) {
                for (int index = position; index < array.length - 1; index++) {
                    array[index] = array[index + 1];
                }
            }
        } while (isExist);
    }

    public static void arrangeArray(int[] array, boolean option) {
        int temp;
        for (int indexOuter = 0; indexOuter < array.length; indexOuter++) {
            for (int indexInner = 0; indexInner < array.length - 1; indexInner++) {
                if (option) {
                    if (array[indexInner] < array[indexInner + 1]) {
                        temp = array[indexInner];
                        array[indexInner] = array[indexInner + 1];
                        array[indexInner + 1] = temp;
                    }
                } else {
                    if (array[indexInner] > array[indexInner + 1]) {
                        temp = array[indexInner];
                        array[indexInner] = array[indexInner + 1];
                        array[indexInner + 1] = temp;
                    }
                }
            }
        }
    }
}
