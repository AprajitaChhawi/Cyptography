#3x=4mod5
#-2x=4mod5
#x=-2mod5
#x=3mod5-------------------(1)

#9x+4=12mod7
#9x=8mod7
#2x=8mod7
#x=4mod7-------------------(2)
from sympy.ntheory.modular import crt 
  
m = [5, 7] 
v = [3, 4] 
  
# Use crt() method  
crt_m_v = crt(m, v)  
      
print("Result of the Chinese Remainder Theorem = {} ".format(crt_m_v[0])) 
