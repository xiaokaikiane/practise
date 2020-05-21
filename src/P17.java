import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr_s=new int[n];
        int count=0;
        double sum=0;
        for (int i=0;i<arr_s.length;i++){
            arr_s[i]=scanner.nextInt();
            count=count+arr_s[i];
        }
        int[] arr_D=new int[n];
        for (int i=0;i<arr_D.length;i++){
            arr_D[i]=scanner.nextInt();
        }
        double[] arr_d=new double[n];
        for(int i=0;i<arr_D.length;i++) {
              if(90<=arr_D[i]&&arr_D[i]<=100) {
                  arr_d[i] = 4.0*arr_s[i];
              }else if(85<=arr_D[i]&&arr_D[i]<=89){
                  arr_d[i]=3.7*arr_s[i];
              }else if(82<=arr_D[i]&&arr_D[i]<=84){
                  arr_d[i]=3.3*arr_s[i];
              }else if(78<=arr_D[i]&&arr_D[i]<=81){
                  arr_d[i]=3.0*arr_s[i];
              }else if (75<=arr_D[i]&&arr_D[i]<=77){
                  arr_d[i]=2.7*arr_s[i];
              }else if (72<=arr_D[i]&&arr_D[i]<=74){
                  arr_d[i]=2.3*arr_s[i];
              }else if (68<=arr_D[i]&&arr_D[i]<=71){
                  arr_d[i]=2.0*arr_s[i];
              }else if (64<=arr_D[i]&&arr_D[i]<=67){
                  arr_d[i]=1.5*arr_s[i];
              }else if (60<=arr_D[i]&&arr_D[i]<=63){
                  arr_d[i]=1.0*arr_s[i];
              }else{
                  arr_d[i]=0*arr_s[i];
              }
        }
        for(int i=0;i<arr_s.length;i++){
            sum=sum+arr_d[i];
        }
        System.out.println(sum);
        System.out.println(count);
        System.out.printf("%.2f",sum/count);
    }
}
