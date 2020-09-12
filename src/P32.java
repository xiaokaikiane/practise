public class P32 {
    public static int getMaxArea (int x1, int y1, int x2, int y2,
                           int x3, int y3, int x4, int y4) {
        if (x1<0||y1<0||x2>10||y2>10||x3<0||y3<0||x4>10||y4>10){
            return 0;
        }
        int [] a=new int[5];
        a[0]=x1-0;
        a[1]=10-x2;
        a[2]=x3-0;
        a[3]=10-x4;
        if (x2<=x3) {
            a[4] = x3 - x2;
        }else{
            a[4]=0;
        }
        int[] b=new int[5];
        b[0]=y1-0;
        b[1]=10-y2;
        b[2]=y3-0;
        b[3]=10-y4;
        if (y2<=y3) {
            b[4] = y3 - y2;
        }else {
            b[4]=0;
        }
        int max=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if (max<a[i]*b[j]){
                    max=a[i]*b[j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getMaxArea(0,0,1,1,9,9,10,10));
    }
}
