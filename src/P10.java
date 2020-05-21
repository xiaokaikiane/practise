
import java.util.Scanner;

    public class P10 {
        /*
        题目描述
        验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
        例如：
        1^3=1 
        2^3=3+5 
        3^3=7+9+11 
        4^3=13+15+17+19 
        输入描述:
        输入一个int整数
        输出描述:
        输出分解后的string
        输入例子:
        6
        输出例子:
        31+33+35+37+39+41
        */
        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            while(scn.hasNext()){
                int n=scn.nextInt();
                stringFenJie(n);
            }

        }
        public static void stringFenJie(int n){
            int start=(int)(Math.pow(n, 3)/n-(double)(n-1));
            for (int i = 0; i < n-1; i++) {
                System.out.print(start+"+");
                start+=2;
            }
            System.out.println(start);
        }
    }
    /**public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] str=new int[10];
        for(int i=0;i<10;i++){
            str[i]=scanner.nextInt();
        }
        for(int i=1;i<10;i++){
            if(str[i]!=0){
                System.out.print(i);
                str[i]--;
                break;
            }
        }
        while(str[0]>0){
            System.out.print(0);
            str[0]--;
        }
        for(int i=1;i<10;i++){
            while(str[i]>0){
                System.out.print(i);
                str[i]--;
            }
        }
    }
     */
