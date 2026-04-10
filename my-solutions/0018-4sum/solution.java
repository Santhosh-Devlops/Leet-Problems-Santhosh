import java.util.*;

class Solution {

    public List<List<Integer>> kSum(int[] nums, long target, int k) {
        Arrays.sort(nums);
        return solve(nums, target, k, 0);
    }

    private List<List<Integer>> solve(int[] nums, long target, int k, int start) {
        List<List<Integer>> res = new ArrayList<>();

        if (k == 2) {
            int l = start, r = nums.length - 1;

            while (l < r) {
                long sum = (long) nums[l] + nums[r];

                if (sum == target) {
                    res.add(Arrays.asList(nums[l], nums[r]));
                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } 
                else if (sum < target) l++;
                else r--;
            }
            return res;
        }

        for (int i = start; i <= nums.length - k; i++) {

            if (i > start && nums[i] == nums[i - 1]) continue;

            for (List<Integer> temp : solve(nums, target - nums[i], k - 1, i + 1)) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.addAll(temp);
                res.add(list);
            }
        }

        return res;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        return kSum(nums, (long) target, 4);
    }
}
