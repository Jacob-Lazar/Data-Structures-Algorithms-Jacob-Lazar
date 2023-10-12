n = int(input())
l = []
l.append(int(input()))
min = l[0]
for i in range(1, n):
    l.append(int(input()))
    if l[i] < min:
        min = l[i]
print(min)

