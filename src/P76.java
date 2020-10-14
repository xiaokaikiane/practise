import java.util.Scanner;

public class P76 {
    public  static int  func(int x, String s) {
        if(s.length()<x){
            return 0;
        }
        char[] arr=s.toCharArray();
        char cur=arr[0];
        int count=0;
        for(int i=1;i<x;i++){
                for(int j=x-1;j>=i+1;j--){
                    if (cur==arr[j]){
                        count++;
                        cur=arr[j];
                        i=j-1;
                        break;
                    }
                    if (j==i+1&&arr[j]!=arr[i]){
                        count++;
                        cur=arr[i];
                    }
                    if(arr[j]==arr[i]){
                        count+=2;
                        cur=arr[j];
                        i=j-1;
                        break;
                    }
                }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        scanner.nextLine();
        String s=scanner.nextLine();
        System.out.println(func(x,s));
    }
}
