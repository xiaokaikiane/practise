import java.util.Scanner;

public class P61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if(s==null){
                System.out.println("");
            }else {
                String s2 = "";
                for (int i = s.length() - 1; i >= 0; i--) {
                    if (s.charAt(i) != '_') {
                        break;
                    }
                    s2 += "_";
                }
                String s1 = "";
                String[] arr = s.split("_");
                for (int i = 0; i < arr.length; i++) {
                    StringBuilder stringBuilder = new StringBuilder(arr[i]);
                    stringBuilder.reverse();
                    s1 += stringBuilder.toString();
                    s1 += "_";
                }
                System.out.println(s1.substring(0, s1.length() - 1) + s2);
            }
        }
    }
}
