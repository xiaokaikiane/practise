import java.util.Scanner;

public class P45 {
    public static int func(String h,String n){
        if(n.length()==0||n==null){
            return 0;
        }
        if(h.contains(n)){
           for (int i=0;i<h.length();i++){
               if (n.charAt(0)==h.charAt(i)){
                   return i;
               }
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        System.out.println(func(arr[0],arr[1]));
    }
}
