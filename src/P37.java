
import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            scanner.nextLine();
            String s=scanner.nextLine();
            System.out.println(func(n,s));
    }

    private static String  func(int n, String s) {
        if(s.length()==0){
            return "";
        }
        int length=s.length();
        StringBuilder sb=new StringBuilder("");
        int index=0;
        if(length%n>0){
            index=length/n+1;
        }else{
            index=length/n;
        }
        String[] arr=new String[index];
        int x=0;
        for (int i=0,j=i+n;i<length;i+=n,j+=n){
            if(j>length){
                j=length;
            }
            arr[x++]=s.substring(i,j);
        }
        for(int i=0;i<arr.length;i++){
            StringBuilder stringBuilder=new StringBuilder(arr[i]);
            stringBuilder.reverse();
            sb.append( stringBuilder);
        }
        return sb.toString();
    }
}
