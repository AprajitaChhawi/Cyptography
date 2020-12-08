from __future__ import print_function
sharedPrime = 353   
sharedBase = 3     #primitive root of 353 is 3
 
aliceSecret = 97    
bobSecret = 223     
print( "Publicly Shared Variables:")
print( "    Publicly Shared Prime: " , sharedPrime )
print( "    Publicly Shared Base:  " , sharedBase )
 
A = (sharedBase**aliceSecret) % sharedPrime
print( "\n  Alice Sends Over Public Chanel: " , A )
 
B = (sharedBase ** bobSecret) % sharedPrime
print(" \n  Bob Sends Over Public Chanel: ", B )
 
print( "\n------------\n" )
print( "Privately Calculated Shared Secret:" )

aliceSharedSecret = (B ** aliceSecret) % sharedPrime
print( "    Alice Shared Secret: ", aliceSharedSecret )
 

bobSharedSecret = (A**bobSecret) % sharedPrime
print( "    Bob Shared Secret: ", bobSharedSecret )
