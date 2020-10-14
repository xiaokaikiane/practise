import java.util.Scanner;

public class P77 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] arr=s.split(" ");
        int n=Integer.parseInt(arr[0]);//n参赛选手数量
        int m=Integer.parseInt(arr[1]);//m比赛场次
        int p=Integer.parseInt(arr[2]);//p牛牛的编号
        for(int i=0;i<m;i++){
            String s1=scanner.nextLine();
            String[] arr1=s1.split(" ");
        }
        //来不及写了,思路:
        // 先找到牛牛打败的那个选手,每打败一个选手变add进一个list中,递归败方打败的那个人,在add进list中,
        //终止条件就是败方的那个人没有打败的选手
        //最后查看list中有几个人,用总人数减掉牛牛打败的选手,就是牛牛可能的排名
    }
}
