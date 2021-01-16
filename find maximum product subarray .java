class Solution {
    public int maxProduct(int[] nums) {
         // code here
        int n= nums.length;
        if(n==0){
            return -1;
        }
       int min=nums[0];
        int max=nums[0], ans= nums[0];
        int choice1, choice2;
        for(int i=1;i<n;i++){
            choice1=min*nums[i];
            choice2=max*nums[i];
            min=Math.min(nums[i],Math.min(choice1,choice2) );
             max=Math.max(nums[i],Math.max(choice1,choice2) );
             ans= Math.max(ans, max);
        }
        return ans;
    }
        
    
}
