import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

    }
}
/**
    public static int addAB(int A, int B) {
        int c;
        while(true){
            c=A^B;
            int d=(A&B)<<1;
            if(d==0){
                break;
            }
            A=c;
            B=d;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(addAB(24,16));
    }
    */