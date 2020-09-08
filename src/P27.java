import java.util.Scanner;

public class P27 {
    public static int func(String s){
        int length=s.length();
        if(length<8||length>120){
            return 1;
        }
        int[] book=new  int[4];
        for(int i=0;i<length;i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                book[0]=1;
                continue;
            }
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                book[1]=1;
                continue;
            }
            if (s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                book[2]=1;
                continue;
            }
            if((s.charAt(i)>=33&&s.charAt(i)<=47)||(s.charAt(i)>=58&&s.charAt(i)<=64)){
                book[3]=1;
                continue;
            }
        }
        for(int i=0;i<book.length;i++){
            if(book[i]==0){
                return 2;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] sss = s.split(" ");
        for (int i=0;i<sss.length;i++){
            System.out.println(func(sss[i]));
        }
    }
}
