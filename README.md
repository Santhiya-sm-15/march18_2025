# march18_2025
The problem that i solved today in leetcode

1.You are given an array nums consisting of positive integers.

We call a subarray of nums nice if the bitwise AND of every pair of elements that are in different positions in the subarray is equal to 0.

Return the length of the longest nice subarray.

A subarray is a contiguous part of an array.

Note that subarrays of length 1 are always considered nice.

Code:
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
