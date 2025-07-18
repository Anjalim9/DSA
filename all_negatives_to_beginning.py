from os import *
from sys import *
from collections import *
from math import *
def separateNegativeAndPositive(nums):
    r=len(nums)-1
    l=0
    while l<=r:
        if nums[l]<0:
            l+=1
        elif nums[r]>=0:
            r-=1
        else:
            nums[l],nums[r]=nums[r],nums[l]
            l+=1
            r-=1
    return nums 
