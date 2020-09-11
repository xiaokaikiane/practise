import java.util.Scanner;

public class P30 {
    public static String func(String s){
        if (s.length()<8){
            return "Irregular password";
        }
        boolean[] book=new boolean[4];
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                book[0]=true;
                continue;
            }else if (s.charAt(i)>='a'&&s.charAt(i)<='z'){
                book[1]=true;
                continue;
            }else if (s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                book[2]=true;
                continue;
            }else{
                book[3]=true;
                continue;
            }
        }
        for (int i=0;i<book.length;i++){
            if (book[i]==false){
                return "Irregular password";
            }
        }
        return "Ok";
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(func(s));
        }
    }
}
