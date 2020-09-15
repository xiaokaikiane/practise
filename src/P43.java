import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> list=new ArrayList<>();
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            list.add(Integer.parseInt(arr[i]));
        }
        for(int i=n-1;i>=0;i--){
            Integer a=list.remove(i);
            list.add(a);
        }
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            System.out.println(" ");
        }
    }
}
