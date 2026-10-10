class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> inset = new HashSet<>();

        for(int num:nums){
            if(inset.contains(num)){
                return true;
            }
            inset.add(num);
           
        }
        return false;
    }
}