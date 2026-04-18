public class Solution{
    public static void reverse(int[] nums, int si, int ei){
        while(si < ei){
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;

        }
    }
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, k - 1); 
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);

    }
    public static void main(String[] args) {
        int[] nums = {3,4,1,5,3,-5};
        int k = 8;
        rotateArray(nums, k);

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}