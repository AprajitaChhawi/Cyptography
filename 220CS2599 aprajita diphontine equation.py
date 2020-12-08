#solving 14x=12(mod 18)
#a=14,b=18,c=12
#calculate the gcd of 14 and 18
def gcdExtended(a, b):
    if a == 0 :   
        return b,0,1
    gcd,x1,y1 = gcdExtended(b%a, a)
    x = y1 - (b//a) * x1  
    y = x1  
    return gcd,x,y
def modInverse(a,m): 
    m0 = m 
    y = 0
    x = 1
    if (m == 1):
        return 0
    while (a > 1):
        q = a // m
        t = m 
        m = a % m 
        a = t 
        t = y  
        y = x - q * y 
        x = t  
    if (x < 0): 
        x = x + m0
    return x
g1=gcdExtended(14,18)
g=g1[0]
if(12%g!=0):
    print("no solution")
else:
    print("solution exist")
    x2=(int(12/2)*modInverse(7,9))%9
    print("the value of x0 is",str(x2))
    print("the other value of x is "+str(x2)+"+9*k where k is from [0,infinity]")
