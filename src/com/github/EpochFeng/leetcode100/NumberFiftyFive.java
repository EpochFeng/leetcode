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

    public int findKthLargest1(int[] nums, int k) {
        int length = nums.length;
        sort(nums,length);
        for (int i = 1; i < k+1; i++) {
            int temp = nums[0];
            nums[0] = nums[length-i];
            nums[length-i] =temp;
            heapify(nums,length-i,0);
        }
        return nums[nums.length-k];
    }
    public void sort(int[] nums,int length){
        for (int i = length/2-1; i >=0; i--) {
            heapify(nums,length,i);
        }
    }
    public void heapify(int[] nums,int n,int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int temp = i;
        if (left<n&&nums[left]>nums[temp]){
            temp = left;
        }
        if (right<n&&nums[right]>nums[temp]){
            temp = right;
        }
        if (temp!=i){
            int temporary = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temporary;
            heapify(nums,n,temp);
        }

    }

}
