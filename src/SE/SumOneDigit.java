package SE;

import java.util.Scanner;

public class SumOneDigit {

    //Напишите программу на Java, чтобы добавить все цифры заданного
    //положительного целого числа, пока результат не будет иметь одну цифру.

        public static void main(String[] arg) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a positive integer: ");
            int n = in.nextInt();
            if (n>0)
            {
                System.out.print("The single digit number is: "+ (n % 9 == 0 ? 9 : n % 9));
            }
            System.out.println("\n");
        }
    }
