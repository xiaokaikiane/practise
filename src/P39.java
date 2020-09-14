import java.util.Arrays;

public class P39 {
    public int firstMissingPositive (int[] nums) {
        if(nums.length==0){
            return 1;
        }
        Arrays.sort(nums);
        int k=0;
        for(int i=0,j=1;i<nums.length;i++,j++){
            if(j== nums.length){
                k=nums[i]+1;
            }
            if(nums[nums.length-1]<1){
                return 1;
            }else {
                if (nums[j] - nums[i] > 1 && nums[i] >= 0) {
                    k = nums[i] + 1;
                    break;
                }
            }
        }
        return k;
    }
}
