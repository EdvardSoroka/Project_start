package java_se.String;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "ed";
        String name2 = "EDghjklghjl";

        boolean str = name.equals(name2);
        System.out.println(name2);
        System.out.println(str);
        System.out.println("-----------------------");

        System.out.println(name2.toLowerCase());
        System.out.println(name2.substring(1));
        System.out.println(name.length() == name2.length());
        System.out.println("-----------------------");

        String hap = "10 20 30";
        Scanner scanner = new Scanner(hap);
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());

        String ss = "Phyton 3.0";
        System.out.println(ss.substring(0,7) + "Tutorial" + ss.substring(6));




    }
}
