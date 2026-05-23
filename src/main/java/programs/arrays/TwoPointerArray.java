package programs.arrays;

/**
 * Two pointer techniques
 * Demonstrates efficient array manipulation using two pointers
 */
public class TwoPointerArray {

    public static int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Indices for target " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
