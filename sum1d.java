package array;
import java.util.Arrays;
import java.util.Scanner;
public class sum1d {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        int n = nums.length;
        int[] sum = new int[n];
        for (int i =0;i>n;i--){
            sum[i]=nums[i-1]+nums[i];

        }
        System.out.println(Arrays.toString(sum));
    }
}
