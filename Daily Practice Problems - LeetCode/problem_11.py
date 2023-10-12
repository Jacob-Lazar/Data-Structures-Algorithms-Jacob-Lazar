height = [1,8,6,2,5,4,8,3,7]

length = len(height)
r = length - 1
l = 0
area  = 0

while (l < r):
    cur_area = min(height[l], height[r]) * (r - l)
    area = max(area, cur_area)
    
    if height[l] < height[r]:
        l += 1
    else:
        r -= 1

print(area)
