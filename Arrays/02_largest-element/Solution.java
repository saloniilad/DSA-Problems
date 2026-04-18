public class Solution {
    public static int largestElement(int[] nums){
        int largest = nums[0];

        for(int i = 1; i< nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        int[] nums = {3,3,0,99,-40};

        int ans = largestElement(nums);
        System.out.println("Answer : " +ans);
    }
}
