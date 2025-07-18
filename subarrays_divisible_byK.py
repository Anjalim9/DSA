from os import *
from sys import *
from collections import *
from math import *
def subArrayCount(arr, k):
    rem_sum=0
    count=0
    freq={0:1}
    for i in arr:
        rem_sum+=i
        rem=rem_sum%k
        if(rem<0):
            rem+=k
        count+=freq.get(rem,0)
        freq[rem]=freq.get(rem,0)+1
    return count
