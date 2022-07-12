package SE;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int d = scanner.nextInt();
        System.out.printf("%d + %d%d + %d%d%d", d, d, d, d, d, d);
    }

}
