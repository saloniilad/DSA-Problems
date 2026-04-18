public class Solution{
    public static void rotateOneElementOfArrayToLeft(int[] nums){
        int firstElement = nums[0];

        for(int i = 1; i<nums.length; i++){
            nums[i-1] = nums[i];
        }

        nums[nums.length -1] = firstElement;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        rotateOneElementOfArrayToLeft(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}