import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Reverse array
        Integer[] arrayForRevers = {2, 3, 1, 7, 11};
        Arrays.sort(arrayForRevers, Collections.reverseOrder());
        System.out.println("Reverse array - " + Arrays.toString(arrayForRevers));


        //Sum of all the positive
        int[] positive_negative = {2, 5, -1, 3, -7, -5, 12, 4, -6};
        int resultSumPositive = 0;

        for (Integer number : positive_negative) {

            if (number > 0)
                resultSumPositive += number;

        }

        System.out.println("Sum of all the positive: " + resultSumPositive);


        //Average number
        int[] arrayAverageNum = {2, 4, 5, 1, 6, 3, 7, 9, 7};
        double averageNum = 0;

        for (Integer numbers : arrayAverageNum)
            averageNum += numbers;

        averageNum /= arrayAverageNum.length;
        System.out.printf("Average number: %.2f\n", averageNum);


        //Replace all duplicated values by 0
        Integer[] duplicateArray = {3, 2, 3, 1, 4, 2, 8, 3};

        for (int i = 0; i < duplicateArray.length; i++) {

            if (duplicateArray[i] != 0) {

                for (int j = i + 1; j < duplicateArray.length; j++) {

                    if (duplicateArray[i].equals(duplicateArray[j]))
                        duplicateArray[j] = 0;

                }
            }
        }

        System.out.println("Result: " + Arrays.toString(duplicateArray));

    }
}
