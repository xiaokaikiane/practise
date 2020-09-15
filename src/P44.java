import java.util.Scanner;

public class P44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String s=null;
        StringBuilder sb=new StringBuilder(a);
        StringBuilder stringBuilder=new StringBuilder("");
        StringBuilder k=new StringBuilder("");
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z'){
                k.append(sb.substring(0,i));
                stringBuilder.append(sb.delete(0,i));
                System.out.println(stringBuilder.toString());
                k.append('_');
                k.append(stringBuilder);
                s=k.toString();
            }
        }
        System.out.println(s.toLowerCase());
    }
}
