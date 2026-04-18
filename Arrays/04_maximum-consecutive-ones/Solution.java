public class Solution{

    public static int maxConsecutiveOnes(int[] nums){
        int maxOnes = 0;
        int count = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                count ++;
            }else{
                count = 0;
            }

            maxOnes = Math.max(count,maxOnes);
        }

        return maxOnes;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,0,1,1,0};

        int ans = maxConsecutiveOnes(nums);

        System.out.println("Answer : " + ans);
    }
}