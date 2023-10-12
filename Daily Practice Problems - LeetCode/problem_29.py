dividend, divisor = 9, 2
count, f = 0, 0

if  dividend < 0 or divisor < 0:    
    dividend = abs(dividend)
    divisor = abs(divisor)
    f = 1

while dividend >= 0:
   dividend -= divisor
   count += 1

if f == 1:
    print(-1 * (count - 1))
else: 
    print(count - 1)