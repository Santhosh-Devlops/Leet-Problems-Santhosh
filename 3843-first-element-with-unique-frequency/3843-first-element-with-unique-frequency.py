from collections import Counter

class Solution:
    def firstUniqueFreq(self, nums: List[int]) -> int:
        counts = Counter(nums)
        freq_counts = Counter(counts.values())
        
        for x in nums:
            if freq_counts[counts[x]] == 1:
                return x
                
        return -1
