package homeworks;

public class ArrayHomework {
    public static void main(String[] args) {
        int n = 6;
        int [] numbers = {6, 5, 12, 66, 8, 7, 9, 0, 5, 2, 6, 7, 9,8, 5,};
        if (numbers.length==0)
        {
            System.out.println("empty array");
            return;
        }

        int countOfN=0;
        for (int i = 0; i < numbers.length; i++)
            {
                if (n == numbers[i]) {
                    countOfN++;
                }
            }

        if (countOfN==0) {
            System.out.println("0");
            } else {
                System.out.println("Count of the " + "'" + n + "'" + " " + "number " + "is equal to " +  countOfN);
        }

        int [] numbers2 =  new int [numbers.length];
        for (int i = 0; i < numbers.length; i ++) {
            numbers2[i] = numbers[numbers.length - 1 - i];
        }
        System.out.print("new array: ");
        for (int i = 0; i < numbers2.length ; i++) {
            System.out.print(numbers2[i] + " ");


        };

        System.out.println();
        int[] duplicatednumbers = new int[numbers.length];
        int duplicates = 0;


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {

                    boolean isAlreadyExist = false;
                    for (int k = 0; k < duplicates; k++) {
                        if (duplicatednumbers[k] == numbers[i]) {
                            isAlreadyExist = true;
                            break;
                        }
                    }


                    if (!isAlreadyExist) {
                        duplicatednumbers[duplicates++] = numbers[i];
                    }
                }
            }
        }

        System.out.print("Duplicates: ");
        for (int i = 0; i < duplicates; i++) {
            System.out.print(duplicatednumbers[i] + ", ");
        }

        char[] charWords = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ' , 'ը'};
        char[] vowelChars = {'ա', 'ի', 'ո', 'է', 'օ', 'ը'};
        boolean [] counted = new boolean[charWords.length];
        int vowelCount = 0;

        for (int i = 0; i < charWords.length; i++) {
            for (int j = 0; j < vowelChars.length; j++) {
                if (charWords[i] == vowelChars[j] && !counted[j]){
                    vowelCount++;
                    counted[i] = true;
                    break;
                }

            }
        }
        System.out.println();
        System.out.println("Count of vowels are: " + vowelCount);

    }

}


