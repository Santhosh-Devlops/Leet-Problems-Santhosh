import java.util.*;

class Solution {

    public List<List<Integer>> kSum(int[] nums, int target, int k) {
        Arrays.sort(nums);
        return kSumHelper(nums, target, k, 0);
    }

    private List<List<Integer>> kSumHelper(int[] nums, int target, int k, int start) {
        List<List<Integer>> res = new ArrayList<>();

        // 🔥 Base case: 2Sum
        if (k == 2) {
            int left = start, right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    res.add(Arrays.asList(nums[left], nums[right]));

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } 
                else if (sum < target) left++;
                else right--;
            }
            return res;
        }

        // 🔥 Recursive case
        for (int i = start; i <= nums.length - k; i++) {

            if (i > start && nums[i] == nums[i - 1]) continue;

            List<List<Integer>> temp = kSumHelper(nums, target - nums[i], k - 1, i + 1);

            for (List<Integer> list : temp) {
                List<Integer> newList = new ArrayList<>();
                newList.add(nums[i]);
                newList.addAll(list);
                res.add(newList);
            }
        }

        return res;
    }

    // ✅ 3Sum wrapper
    public List<List<Integer>> threeSum(int[] nums) {
        return kSum(nums, 0, 3);
    }
}