matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]

w = {}
l = {}

for match in matches:
    if w.get(match[0]) != 0:
        w[match[0]] = w.get(match[0], 0) + 1
    elif w[match[1]] == 0:
        
