import java.util.Scanner;

public class P66 {
    public static String func(int[] arr){
        for (int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
        String s="";
        for(int i=0;i<arr.length;i++){
           s+=String.valueOf(arr[i]);
           s+=",";
        }
        return s.substring(0,s.length()-1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.nextLine();
        String s=scanner.nextLine();
        String[] ret=s.split(",");
        int [] arr=new int[num];
        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(ret[i]);
        }
        System.out.println((func(arr)));
    }
}
