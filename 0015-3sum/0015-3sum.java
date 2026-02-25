class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> l = new ArrayList<>();
        int n = nums.length;

        if (n < 3) return l;

        Arrays.sort(nums);

        int i = 0;
        while (i < n - 2) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    l.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            i++;
            while (i < n - 2 && nums[i] == nums[i - 1]) i++;
        }

        return l;
    }
}
