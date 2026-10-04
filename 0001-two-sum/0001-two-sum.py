class Solution(object):
    def twoSum(self, nums, target):
         hash_map = {}
         for i, num in enumerate(nums):
            completement=target-num
            if completement in hash_map:
                return [hash_map[completement],i]
            hash_map[num]=i
         return []        
