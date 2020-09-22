import java.util.Scanner;

public class P50 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();

        while(true) {
            int num=0;
            while (k > 0) {
                num += k % 10;
                k = k / 10;
            }
            k=num;
            if (k<10){
                System.out.println(num);
                break;
            }
        }
    }
}
