class Solution {
    public void sortColors(int[] nums) {

        int l =0,t=0,h=nums.length-1,temp=0;
        
        while(t<=h){
            
        
            switch(nums[t]){
                case 0:
                    temp=nums[l];
                    nums[l] = nums[t];
                    nums[t]=temp;
                    l++;
                    t++;
                    break;
                case 1:
                    t++;
                    break;
                case 2:
                    temp = nums[t];
                    nums[t] = nums[h];
                    nums[h] = temp;
                    h--;
                    break;
        }
    }
    }
}