package _026_removeDuplicates;

/**
 * 删除排序数组中的重复项
 * 方法：快慢指针，i 指针从0开始，j 指针从1 开始，如果i和j 所指数字相等，就一直后移j。如果不相等，i 指针后移一位用来保存当前 j 所指的值，然后继续回到 j 的后移中去。
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
//		int[] a = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] a = new int[] { 1, 1, 2 };
		removeDuplicates(a);
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int index = 0;
		for (int i = 0, j = i + 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
			index = i;
		}
		return index + 1;
	}

	public static int removeDuplicates2(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

}
