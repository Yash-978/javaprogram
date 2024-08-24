import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.
public class Main {
    public static void main(String[] args) {
        //WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.
        int array[] = {10, 20, 30, 40, 50, 60};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }


        }
        System.out.println(max);

        //WAP TO SORT ARRAY IN ASCENDING(LOW TO HIGH) ORDER IN JAVA.
        int[] array1 = new int[]{30, 20, 10, 60, 70, 69, 62};
        int temp = 0;
        System.out.println("");

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + "");

        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] > array1[j]) {
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;

                }
            }
        }
        System.out.println("Ascending order : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }

        //WAP TO FIND THE SUM OF PRIME NUMBERS FROM 1 TO N.






        // WAP TO CREATE PATTERN AS MENTIONED BELOW IMAGE.



    }

            /*static int sumOfPrimes(int n) {
                boolean prime[] = new boolean[n + 1];
                Arrays.fill(prime, true);
                for (int p = 2; p * p <= n; p++) {
                    if (prime[p] == true) {
                        for (int i = p * 2; i <= n; i += p) prime[i] = false;
                    }
                }
                int sum = 0;
                for (int i = 2; i <= n; i++) if (prime[i]) sum += i;
                return sum;
            }

            int n = 24;
            System.out.print(sumOfPrimes(n));*/




}