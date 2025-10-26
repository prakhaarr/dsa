class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        nums=list(map(str,nums))
        nums.sort(reverse=True,key=lambda x:x*10)
        result="".join(nums)
        return '0' if result[0]=='0' else result
   


        