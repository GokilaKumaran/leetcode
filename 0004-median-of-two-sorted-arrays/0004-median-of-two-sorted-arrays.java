class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums=new int[m+n];
        int j=0;
        for(int i=0;i<m;i++){
            nums[j++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            nums[j++]=nums2[i];
        }
        Arrays.sort(nums);
        int k=nums.length;
        if(k%2!=0){
            return nums[k/2];
        }
        else{
            return (nums[(k/2) -1]+nums[k/2])/2.0;
        }
    }
}