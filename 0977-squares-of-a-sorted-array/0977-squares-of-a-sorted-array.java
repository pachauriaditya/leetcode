class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;
        int[] result = new int[nums.length];

        while (left <= right) {
            int leftSq  = nums[left]  * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos] = leftSq;
                left++;
            } else {
                result[pos] = rightSq;
                right--;
            }
            pos--;
        }

        return result;
    }
}