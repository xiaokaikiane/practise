import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            int x = sc.nextInt();
            if (x>=s.length()){
                System.out.println(0);
            }else{
                StringBuilder sb=new StringBuilder(s);
                while(x>0){
                    boolean flag=false;
                    for (int i=0;i<sb.length()-1;i++){
                        if (sb.charAt(i)>sb.charAt(i+1)){
                            sb.deleteCharAt(i);
                            flag=true;
                            break;
                        }
                    }
                    if (flag==false){
                        sb.deleteCharAt(sb.length()-1);
                    }
                    x--;
                }
                while(sb.charAt(0)=='0'&&sb.length()>1){
                    sb.deleteCharAt(0);
                }
                System.out.println(sb.toString());
            }
        }
    }
}
