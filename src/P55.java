import java.util.ArrayList;
import java.util.Arrays;

public class P55 {
    public static int[] pushIntArray (int[] arr, int pushOffset) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<pushOffset%list.size();i++){
            int a=list.remove(list.size()-1);
            list.add(0,a);
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
       int[] arr={1,2,4,5,6,7,8,9};
        System.out.println(pushIntArray(arr,4));
    }
}
