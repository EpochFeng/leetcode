package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFiftyFive
 * @description: TODO
 * @datetime 2026年 06月 25日 6:02 PM
 * @version: 1.0
 */
public class NumberFiftyFive {
    public int findKthLargest(int[] nums, int k) {

        int l = 0;
        int r = nums.length-1;
        while (true){
            int partition = partition(nums, l, r);
            if (partition==nums.length-k){
                return nums[partition];
            }else if (partition<nums.length-k){
                l = partition+1;
            }else {
                r=partition-1;
            }
        }
    }


    public int partition(int[] nums, int l, int r) {

            int low = l;
            int pivot = nums[l];
            for (int i = l + 1; i <= r; i++) {
                if (nums[i] < pivot) {
                    low++;
                    int temp = nums[i];
                    nums[i] = nums[low];
                    nums[low] = temp;
                }
            }
        int temp = nums[l];
        nums[l] = nums[low];
        nums[low] = temp;
        return low;
    }

}
