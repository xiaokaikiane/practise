import java.util.Scanner;

public class P86 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        System.out.println(func(x));
    }

    private static String func(int x) {
       if(x<=0){
           return "";
       }
       StringBuilder stringBuilder=new StringBuilder();
       while(x>0){
           x--;
           stringBuilder.append((char)(x%26+'A'));
           x=x/26;
       }
       return stringBuilder.reverse().toString();
    }
}
