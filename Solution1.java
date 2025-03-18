class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int l=0,r=0,max=0,used=0;
        while(r<n)
        {
            while((used&nums[r])!=0)
            {
                used=used^nums[l];
                l++;
            }
            used=used|nums[r];
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}