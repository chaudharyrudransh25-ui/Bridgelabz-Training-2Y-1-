package Arrays.Logical_Problems;

public class ThirdLargestElement {
        public static int thirdMaximum(int[] nums) {
            int min = nums[0];
            for (int n : nums) min = Math.min(min, n);
            int max = nums[0];
            int second = min;
            int third = min;
            boolean b = false;
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i]) {
                    third = second;
                    second = max;
                    max = nums[i];
                } else if ((nums[i] > second) && (max > nums[i])) {
                    third = second;
                    second = nums[i];
                } else if ((nums[i] > third) && (max > nums[i]) && (second > nums[i])) {
                    third = nums[i];
                }
            }
            if (nums.length == 2 || second == third) {
                return max;
            } else {
                return third;
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 89, 99, 100};
            System.out.println(thirdMaximum(arr));

        }
    }

