#Recursive Solving
def fibo_solver(n):
    if n <= 2:
        return n
    else:
        return fibo_solver(n-1) + fibo_solver(n-2)
    
for i in range(11):
    print(fibo_solver(i))
    
#Iterative Solution 
def fibo_solver(n):
    if n == 0: return 0
    
    a, b = 0, 1
    for i in range(n):
        a, b = b, a+b
    return b

for i in range(11):
    print(fibo_solver(i))