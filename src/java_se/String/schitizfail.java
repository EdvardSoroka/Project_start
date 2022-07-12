package java_se.String;

import java.io.*;

public class schitizfail {
    public static void main(String[] args) throws IOException {

        String inputFileName = "F:\\failfail.txt\\";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
