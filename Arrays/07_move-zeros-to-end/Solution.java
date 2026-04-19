public class Solution{

    public static void move0toend(int[] nums){
        int idx = -1;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                idx++;
                nums[idx] = nums[i];
            }
        }
        idx++;
        while(idx < nums.length){
            nums[idx] =0;
            idx++;
        }
    }

    public static void main(String[] args){
        int[] nums = {0,1,4,0,5,2};
        move0toend(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}