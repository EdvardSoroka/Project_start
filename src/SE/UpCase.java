package SE;

import java.util.Scanner;

public class UpCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
        StringBuilder upper_case_line = new StringBuilder();
        Scanner lineScan = new Scanner(line);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(upper_case_line.toString().trim());
    }
}
