import math

n = int(input())
m = int(input())

def compute_lcm(x, y):

   # choose the greater number
   if x > y:
       greater = x
   else:
       greater = y

   while(True):
       if((greater % x == 0) and (greater % y == 0)):
           lcm = greater
           break
       greater += 1

   return lcm

gcd = math.gcd(n, m)
lcm = compute_lcm(n, m)
sum = gcd + lcm

print(sum)