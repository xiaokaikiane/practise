import java.util.Scanner;

public class P42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int index=sc.nextInt();
        int num=sc.nextInt();
        boolean flag=true;
        while(0<num--){
            System.out.println(arr[index]);
            if(index==a-1){
               flag=false;
            }
            if(index==0){
                flag=true;
            }
            if(flag){
                index++;
            }else{
                index--;
            }
        }
    }
}
