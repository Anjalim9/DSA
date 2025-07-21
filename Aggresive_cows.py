def aggressiveCows(stalls, k):
    stalls.sort()
    res=0;
    l=1
    h=stalls[-1]-stalls[0]
    while l<=h:
        mid=(l+h)//2
        if possible(stalls,k,mid):
            res=mid
            l=mid+1
        else:
            h=mid-1
    return res
def possible(arr,k,dis):
    count=1
    pos=arr[0]
    for i in range(1,len(arr)):
        if arr[i]-pos>=dis:
            count+=1
            pos=arr[i]
        if count==k:
            return True  
    return False
