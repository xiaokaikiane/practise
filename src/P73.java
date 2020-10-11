import java.util.ArrayList;
import java.util.Scanner;

public class P73 {
     static ArrayList<Character> list=new ArrayList<>();
    public static  int func(char A,String[] arr){
        list.add(A);
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0)==A&&!list.contains(arr[i].charAt(arr[i].length()-1))){
                func(arr[i].charAt(arr[i].length()-1),arr);
            }
        }
        return list.size()-1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        int k=scanner.nextInt();
        scanner.nextLine();
        String[] arr=new String[k];
        for(int i=0;i<k;i++){
            arr[i]=scanner.nextLine();
        }
        System.out.println(func(a.charAt(0),arr));
    }
}
