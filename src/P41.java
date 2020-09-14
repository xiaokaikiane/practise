import java.util.Scanner;

public class P41 {
    public static int num(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        int count=0;
        int row=grid.length;
        int col=grid[0].length;
        int[][] book=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1&&book[i][j]==0) {
                    count++;
                    func(grid, book, row, col, i, j);
                }
            }
        }
        return count;
    }
    private static int[][] arr={{0,1},{1,0},{0,-1},{-1,0}};
    private static void func(int[][] grid, int[][] book, int row, int col, int i, int j) {
        book[i][j]=1;
        for (int k=0;k<4;k++){
            int newi=i+arr[k][0];
            int newj=j+arr[k][1];
            if(newi<0||newi>=row||newj<0||newj>=col){
                continue;
            }
            if(grid[newi][newj]==1&&book[newi][newj]==0){
                func(grid, book, row, col, newi, newj);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int [][] arr=new  int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(num(arr));
    }
}

