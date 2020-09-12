
public class P31 {
    public static int maxCandies (int[] candies, int[] coin, int n) {
        if (candies.length<0||coin.length<0||n==0){
            return 0;
        }
      int left=0;
      int right=n-1;
      int max=0;
      int maxleft=0;
      int maxright=0;
      while(right<candies.length) {//稳定获得的最大糖果
          int sum=0;
          for (int i = left; i <=right; i++) {
              sum+=candies[i];
          }
          if(sum>=max){
              max=sum;
              maxleft=left;
              maxright=right;
          }
          left++;
          right++;
      }
      for(int i=0;i<maxleft;i++){
          if (coin[i]==0){
              max+=candies[i];
          }
      }
      for (int j=maxright+1;j<coin.length;j++){
          if (coin[j]==0){
              max+=candies[j];
          }
      }
      return max;
    }
    public static void main(String[] args) {
        int[] arr={3,5,7,2,8,8,15,3};
        int[] ret={1,0,1,0,1,0,1,0};
        System.out.println(maxCandies(arr,ret,3));
    }
}
