sizeA = [int(x) for x in input().split(" ")]
A = list([int(j) for j in input().split(" ")] for i in range(sizeA[0]))
sizeB = [int(x) for x in input().split(" ")]
B = list([int(j) for j in input().split(" ")] for i in range(sizeB[0]))

if sizeA[0] == sizeB[0] and sizeA[1] == sizeB[1]:
    ans = [[A[i][j] + B[i][j] for j in range(len(A[0]))] for i in range(len(A))]
    for my_list in ans:
        print(' '.join(str(x) for x in my_list))
else:
    print("ERROR")
