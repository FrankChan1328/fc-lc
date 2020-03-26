package _35_searchInsert;

public class SearchInsert {

    public static void main(String[] args) {
//        int[] nums = new int[] { 1 };
//        int val = 1;
        
        int[] nums = new int[] { 1,3,5,6 };
        int val = 5;
        
        System.out.println(searchInsert2(nums, val));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] < target) {
                i++;
                index++;
            }
            if (nums[j] >= target) {
                j--;
            }
        }
        return index;
    }
    
    /**
     * 折半插入
     */
    public static int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right < 0) {
            return 0;
        } else {
            return left;
        }
    }
}
