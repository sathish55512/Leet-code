class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[k];
            k+=2;
            i++;
            arr[i] = nums[j];
            j+=2;
        }
        return arr;
    }
}