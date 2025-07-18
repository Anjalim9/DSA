from os import *
from sys import *
from collections import *
from math import *
def isSubSequence(str1, str2):
    l1=0
    l2=0
    while l1<len(str1) and l2<len(str2):
        if str1[l1]==str2[l2]:
            l1+=1
        l2+=1
    return "True" if l1==len(str1) else "False"
