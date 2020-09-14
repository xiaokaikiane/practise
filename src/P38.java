public class P38 {
    public int[] insertSort (int[] data) {
        for(int i=0;i<data.length-1;i++){
            int key=data[i+1];
            int j;
            for(j=i;j>=0;j--){
                if(key>=data[j]){
                    break;
                }
                data[j+1]=data[j];
            }
            data[j+1]=key;
        }
        return data;
    }
}
