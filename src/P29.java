import java.util.Arrays;

public class P29{
    public int minMoves (int[] nums) {
        Arrays.sort(nums);
        int mid=nums.length/2;
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=Math.abs(nums[mid]-nums[i]);
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}