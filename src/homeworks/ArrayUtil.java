package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int result = 0;
        int i;
        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        int countOfEven = 0;
        int countOfOdd = 0;
        int sumOfElemets = 0;
        System.out.print("1.Elements of the array: " );
        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            sumOfElemets += numbers[i];

            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] % 2 == 0) {
                countOfEven++;
            } else {
                countOfOdd++;
            }
            result = result + numbers[i];
        }

        if (numbers.length <= 2) {
            System.out.println("\n11. Can't print middle values");
        } else if (numbers.length % 2 == 0) {
            int mid1 = numbers[(numbers.length / 2) - 1];
            int mid2 = numbers[numbers.length / 2];
            System.out.println("\n11. Middle elements are: " + mid1 + " and " + mid2);
        } else {
            int mid = numbers[numbers.length / 2];
            System.out.println("\n11. Middle element is: " + mid);


        }
        System.out.println("2.The first element of array is " + numbers[0]);
        System.out.println("3.The last element of array is  " + numbers[i - 1]);
        System.out.println("4.The length of the array is " + numbers.length);
        System.out.println("5.1.Max number of the list is " + maxNumber);
        System.out.println("5.2.Min number of the list is " + minNumber);
        System.out.println("6.Min number of the list is " + minNumber);
        System.out.println("7.Total count of even numbers: " + countOfEven);
        System.out.println("8.Total count of odd numbers:  " + countOfOdd);
        System.out.println("9.Sum of elements: " + sumOfElemets);
        System.out.println("10.Average is " + result / numbers.length);
    }
}



