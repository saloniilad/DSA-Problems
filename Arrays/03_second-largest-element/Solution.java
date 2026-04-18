public class Solution{
    public static int secondElement(int[] nums){
        int second_largest = Integer.MIN_VALUE;
        int largest = nums[0];

        for(int i = 1; i<nums.length; i++){
            if(nums[i] > largest){
                second_largest = largest;
                largest = nums[i];
            }else if(largest != nums[i] && nums[i] > second_largest){
                second_largest = nums[i];
            }
        }

        if(second_largest == Integer.MIN_VALUE){
            return -1;
        }

        return second_largest;

    }
    
    public static void main(String[] args) {
        int[] nums = {8,8,7};

        int ans = secondElement(nums);
        System.out.println("Answer : " + ans);
    }
}