name=input("enter your name")
address=input("enter your address")
s=name+address
for i in s:
    s=""
    temp=(ord(i)^127)+67
    print(chr(temp),end="")
