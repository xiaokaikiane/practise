import java.util.*;

public class P84 {
    public static int palindromeCount (String str) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                String s=str.substring(i,j);
                list.add(s);
                System.out.println(s);
            }
        }
        int count=0;
        for(int i=0;i<list.size();i++){
            if(func(list.get(i))){
                count++;
            }
        }
        return count;
    }
    public static boolean func(String s){
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(palindromeCount(s));
    }
}
