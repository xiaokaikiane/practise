//import java.util.Scanner;
//
//public class P54 {
//    private static int  func(char[][] ret, int x, int y) {
//        boolean[][] book=new boolean[x][y];
//        for (int i=0;i<x;i++){
//            for (int j=0;j<y;j++){
//                if (ret[i][j]=='@'){
//                    begin(ret,book,x,y,i,j);
//                }
//            }
//        }
//    }
//    private static int[][] arr={{0,1},{1,0},{0,-1},{-1,0}};
//    private static int  begin(char[][]ret, boolean[][] book, int x, int y, int i, int j) {
//        book[i][j]=true;
//        if (ret[i][j+1]=='#'&&ret[i][j-1]=='#'&&ret[i+1][j]=='#'&&ret[i-1][j]=='#'){
//            return -1;
//        }
//        for (int k=0;k<4;k++){
//            int newi=i+arr[k][0];
//            int newj=j+arr[k][1];
//            if(newi<0||newi>=x||newj<0||newj>=y){
//                continue;
//            }
//            if(ret[newi][newj]==1&&book[newi][newj]==0){
//                func(grid, book, row, col, newi, newj);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int T=scanner.nextInt();
//        while(scanner.hasNext()){
//            int x=scanner.nextInt();
//            int y=scanner.nextInt();
//            String[] arr=new  String[x];
//            for(int i=0;i<x;i++){
//                arr[i]=scanner.nextLine();
//            }
//            char[][] ret=new char[x][y];
//            for (int i=0;i<x;i++){
//                ret[i]=arr[i].toCharArray();
//            }
//            System.out.println(func(ret,x,y));
//        }
//    }
//
//
//
//
//}
