s, t = "anagram", "mangaar"

# Solution 2
# If the key is not present, then count
# If the key is present and the frequency is > the other dictionary count
# Then count the difference

count = 0

ds = {}
dl = {}

for x, y in zip(s, t):
    ds[x] = ds.get(x, 0) + 1
    dl[y] = dl.get(y, 0) + 1

for k in dl:
    if k not in ds:
        count += dl[k]
    elif dl[k] > ds[k]:
        count += dl[k] - ds[k]

print(count)

"""
In python 3.x, the zip function itself runs in O(1) time, 
as it just allocates a special iterable (called the zip object), 
and assigns the parameter array to an internal field. The function 
invocation itself (before control reaches in zip) is O(N), as the 
interpreter must convert the parameters to an array. Every subsequent 
next call on the iterator also runs in O(N). 
"""



"""
#Solution 1
ds = {}
dt = {}

for l in s:
    ds[l] = ds.get(l, 0) + 1

for l in t:
    dt[l] = dt.get(l, 0) + 1

print(ds == dt)
"""