class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : nums){
            if(i != val){
                al.add(i);
            }
        }
        int n = al.size();
        for(int i =0;i<n;i++){
            nums[i] = al.get(i);
        }
        return n;
    }
}