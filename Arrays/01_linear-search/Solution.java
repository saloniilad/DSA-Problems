public class Solution{
    public static int linearSearch(int nums[], int target){

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,2,6,7};

        int target = 2;
        int ans = linearSearch(nums,target);
        System.out.println("Answer : " + ans);
    }
}