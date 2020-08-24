sizeA = [int(x) for x in input().split(" ")]
A = list([int(j) for j in input().split(" ")] for i in range(sizeA[0]))
s = int(input())
ans = [[A[i][j] * s for j in range(sizeA[1])] for i in range(sizeA[0])]
for my_list in ans:
    print(' '.join(str(x) for x in my_list))
