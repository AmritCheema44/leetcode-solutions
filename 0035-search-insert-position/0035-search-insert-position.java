class Solution {
    public int searchInsert(int[] arr, int k) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == k) return mid;
            else if (arr[mid] > k) h = mid - 1;
            else l = mid + 1;
        }
        return l;
    }
}