_ = '_'
nums=list(map(int,input().split()))
res=[]
freq={}
for i in nums:
    if freq.get(i,0)<2:
        res.append(i) 
        freq[i]=freq.get(i,0)+1
print(len(res),end='')        
res+=[_]*(len(nums)-len(res))

def custom(lst):
    parts=[]
    for x in lst:
        if x==_:
            parts.append('_')
        else:
            parts.append(str(x))
    return '['+', '.join(parts)+']'        
print(f", nums = {custom(res)}")
