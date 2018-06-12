/*
            Tahereh Farhang , Barbod Accademy , 2nd session , 2nd excercise.
 */
package PrimeNumber;

import java.util.Scanner;

/**
 *
 * @author Totia
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter length of Array: ");
        int num = sc.nextInt();
        int[] intArray = new int[num];
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(String.format("Number %d : ", i));
            intArray[i] = sc.nextInt();
        }
        for (int i = 0; i < intArray.length; i++) {
            boolean flag = true;
            if (intArray[i] <= 1) {
                flag = false;
            }
            for (int j = 2; j < intArray[i]; j++) {
                if (intArray[i] % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println(String.format("%d", intArray[i]));
            }
        }
    }
}
