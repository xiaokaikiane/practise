
import java.util.Scanner;

public class P72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s == null || s.length() == 0) {
            System.out.println("");
        } else {
            StringBuilder stringBuilder = new StringBuilder(s);
            for (int i = 0; i < stringBuilder.length() - 1; i++) {
                if (stringBuilder.charAt(i) != stringBuilder.charAt(i + 1)) {
                    stringBuilder.replace(i, i + 1, stringBuilder.charAt(i) + "_");
                    i++;
                }
            }
            s = stringBuilder.toString();
            String[] arr = s.split("_");
            String ss = "";
            for (int i = 0; i < arr.length; i++) {
                ss += arr[i].charAt(0);
                ss += "_";
                ss += String.valueOf(arr[i].length());
                ss += "_";
            }
            System.out.println(ss.substring(0, ss.length() - 1));
        }
    }
}
