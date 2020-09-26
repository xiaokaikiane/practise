import java.util.Scanner;

public class P68 {
    public static String func(int num){
        String s="";
        while (true) {
            if (num % 2 == 0) {
                num = num / 2;
                s += "2*";
            } else if (num % 5 == 0) {
                num = num / 5;
                s += "5*";
            } else if (num % 7 == 0) {
                num = num / 7;
                s += "7*";
            } else if (num==1){
                break;
            }else {
                s+=String.valueOf(num);
                s+="*";
                break;
            }
        }
       return s.substring(0,s.length()-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(func(num));
    }
}
