import java.util.ArrayList;
import java.util.Scanner;

public class P79 {

    private static String func(String x, String y) {
        if(x.length()==0||x==null){
            return y;
        }
        if(y.length()==0||y==null){
            return x;
        }
        ArrayList<Integer> list=new ArrayList<>();
        int lenx=x.length();
        int leny=y.length();
        int length=Math.min(lenx,leny);
        int k=0;
        int n=0;
        for(int i=length-1;i>=0;i--){
            k=(Integer.parseInt(String.valueOf(x.charAt(lenx-1)))+n+
                    Integer.parseInt(String.valueOf(y.charAt(leny-1))))%10;
            n=(Integer.parseInt(String.valueOf(x.charAt(lenx-1)))+n+
                    Integer.parseInt(String.valueOf(y.charAt(leny-1))))/10;
            lenx--;
            leny--;
            list.add(0,k);
        }
        length=Math.max(lenx,leny);
        if(lenx>leny) {
            for (int i = length - 1; i >= 0; i--) {
                k =(Integer.parseInt(String.valueOf(x.charAt(i)))+n)%10;
                n=(Integer.parseInt(String.valueOf(x.charAt(i)))+n)/10;
                list.add(0,k);
            }
        }else{
            for (int i = length - 1; i >= 0; i--) {
                k =(Integer.parseInt(String.valueOf(y.charAt(i)))+n)%10;
                n=(Integer.parseInt(String.valueOf(y.charAt(i)))+n)/10;
                list.add(0,k);
            }
        }
        if (n!=0){
            list.add(0,n);
        }
        String s="";
        for(int i=0;i<list.size();i++){
            s+=String.valueOf(list.get(i));
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split("#");
        if (arr.length == 1) {
            String x="";
            System.out.println(func(arr[0],x));
        } else {
            System.out.println(func(arr[0], arr[1]));
        }
    }
}
