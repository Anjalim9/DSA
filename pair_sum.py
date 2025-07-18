from os import *
from sys import *
from collections import *
from math import *
def pairSum(arr, n, target):
    n=len(arr)
    count=0
    l=0
    r=n-1
    while l<r:
        curr_sum=arr[l]+arr[r]
        if(curr_sum==target):
            count+=1
            l+=1
            r-=1
        elif curr_sum<target:
            l+=1
        else:
            r-=1           
    return count if count>0 else -1   
