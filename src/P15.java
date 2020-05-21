

import java.util.Scanner;

public class P15 {
    /*
    public static int getTotalCount(int monthCount) {

            if (monthCount <= 2) {
                return 1;
            }
            return getTotalCount(monthCount - 1) + getTotalCount(monthCount - 2);
    }
    */
    public static char change(char x){
        char[] s={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i=0;i<s.length;i++){
            if (x==s[i]){
                x=s[(i+21)%s.length];
                break;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while(scanner.hasNext()){
           String a=scanner.nextLine();
           char[] c=a.toCharArray();
           char[] e=new char[c.length];
           for(int i=0;i<c.length;i++){
               e[i]=change(c[i]);
           }
           System.out.println(c);
           String d=String.valueOf(e);
           System.out.println(d);
       }
    }
}
