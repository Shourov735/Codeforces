t = int(input())

for _ in range(t):
    n, x = map(int, input().split())
    a = list(map(int, input().split()))
	
    max_diff = a[0]
    for i in range(1, n):
        max_diff = max(max_diff, a[i] - a[i-1])
    max_diff = max(max_diff, 2 * (x - a[n-1]))
    print(max_diff)