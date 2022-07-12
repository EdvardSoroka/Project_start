package java_se.String;

public class Last3Num {
    public static void main(String[] args) {
        String str = "30.0.3";
        String str2 = "";
        str = str.substring(3);

        for (int i = 0; i<4; i++){
            str = str2.concat(str);
            System.out.print(str);
        }
    }

}
