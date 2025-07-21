def getMedian(matrix):
    seq=[i for row in matrix for i in row]
    seq.sort()
    mid=len(seq)//2
    return seq[mid]
