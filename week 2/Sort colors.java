class Solution {
    public void sortColors(int[] nums) {
        int zero_count=0,one_count=0,two_count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0){
                zero_count+=1;
            }else if(nums[i]==1){
                one_count+=1;
            }else{
                two_count+=1;
            }
        }
        int i;
        for(i=0;i<zero_count;i++){
            nums[i]=0;
        }
        for(i=zero_count;i<(zero_count+one_count);i++){
            nums[i]=1;
        }
        for(i=zero_count+one_count;i<(zero_count+one_count+two_count);i++){
            nums[i]=2;
        }
        
    }
}
