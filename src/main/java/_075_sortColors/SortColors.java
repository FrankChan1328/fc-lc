package _075_sortColors;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                a++;
            } else if (nums[i] == 1) {
                b++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (a > 0 && i < a) {
                nums[i] = 0;
            } else if (b > 0 && i < b + a) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }

}
