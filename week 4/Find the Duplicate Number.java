class Solution {
    public int findDuplicate(int[] nums) {
        ArrayList<Integer>list = new ArrayList<Integer>();
       
        for(int num:nums){
            if(list.contains(num)){
                return num;
            }
            else{
                list.add(num);
            }
        }
        return -1;
    }
}
